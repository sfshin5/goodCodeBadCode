package com.sfshin5.list5_29;

import java.util.List;

// 意味のある単位ごとにクラス化する例
class MagicPoint {
    private int currentAmount;
    private int originalMaxAmount;
    private final List<Integer> maxIncrements;

    // コンストラクタ
    MagicPoint(final int originalMaxAmount, final List<Integer> maxIncreases) {
        if (originalMaxAmount < 0) {
            throw new IllegalArgumentException("元の最大マジックポイントは0以上でなければなりません。");
        }
        this.originalMaxAmount = originalMaxAmount;
        this.maxIncrements = maxIncreases;
        this.currentAmount = originalMaxAmount;
    }

    // 現在のマジックポイントを取得する
    int current() {
        return currentAmount;
    }

    // 魔法力の最大値を取得する
    int max(){
        int amount = originalMaxAmount;
        for (int each : maxIncrements) {
            amount += each;
        }
        return amount;
    }

    // 魔法力を回復する
    void recover(final int recoveryAmount) {
        currentAmount = Math.min(currentAmount + recoveryAmount, max());
    }

    // 魔法力を消費する
    void consume(final int consumeAmount) {
        if (consumeAmount > currentAmount) {
            throw new IllegalArgumentException("消費量が現在のマジックポイントを超えています。");
        }
        currentAmount -= consumeAmount;
    }

}
    