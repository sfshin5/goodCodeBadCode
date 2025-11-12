package com.sfshin5.list5_11;

class GiftPoint {
    private static final int MIN_POINT = 0;
    private static final int STANDARD_MEMBERSHIP_POINT = 3000;
    private static final int PREMIUM_MEMBERSHIP_POINT = 10000;
    final int value;

    // 外部からはインスタンス生成できない。
    // クラス内部でのみインスタンス生成可能。
    private GiftPoint(final int point) {
        if(point < MIN_POINT) {
            throw new IllegalArgumentException("ポイントは" + MIN_POINT + "以上でなければなりません。");
        }
        this.value = point;
    }

    // 標準会員向け入会ギフトポイント
    static GiftPoint forStandardMembership() {
        return new GiftPoint(STANDARD_MEMBERSHIP_POINT);
    }

    // プレミアム会員向け入会ギフトポイント
    static GiftPoint forPremiumMembership() {
        return new GiftPoint(PREMIUM_MEMBERSHIP_POINT);
    }
    
}
