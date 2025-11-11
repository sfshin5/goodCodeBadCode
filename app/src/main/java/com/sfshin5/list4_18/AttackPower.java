package com.sfshin5.list4_18;

class AttackPower {
    static final int MIN = 0;
    final int value;

    AttackPower(final int value){
        if(value < MIN) {
            throw new IllegalArgumentException("攻撃力は" + MIN + "以上でなければなりません。");
        }
        this.value = value;
    }

    // 攻撃力を強化するメソッド
    AttackPower enhance(final AttackPower increment){
        return new AttackPower(this.value + increment.value);
    }

    // 攻撃力を無効化するメソッド
    AttackPower disable(){
        return new AttackPower(MIN);
    }

}