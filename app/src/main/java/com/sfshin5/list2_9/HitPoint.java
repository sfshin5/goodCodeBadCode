package com.sfshin5.list2_9;

public class HitPoint {

    private static final int MIN = 0;
    private static final int MAX = 999;
    private static final int MIN_DAMAGE_AMOUNT = 0;
    private static final int MIN_RECOVERY_AMOUNT = 0;
    private int value;
    
    HitPoint(final int value){
        if(value < MIN) {
            throw new IllegalArgumentException("HPは" + MIN + "以上でなければなりません。");
        }
        if(value > MAX) {
            throw new IllegalArgumentException("HPは" + MAX + "以下でなければなりません。");
        }
        
        this.value = value;
    }
    
    HitPoint damage(final int damageAmount){
        if(damageAmount < MIN_DAMAGE_AMOUNT){
            throw new IllegalArgumentException("ダメージ量は" + MIN_DAMAGE_AMOUNT + "以上でなければなりません。");
        }
        
        final int damaged = value - damageAmount;
        final int corrected = damaged < MIN ? MIN : damaged;
        return new HitPoint(corrected);
    }
    
    HitPoint recover(final int recoveryAmount){
        if(recoveryAmount < MIN_RECOVERY_AMOUNT){
            throw new IllegalArgumentException("回復量は" + MIN_RECOVERY_AMOUNT + "以上でなければなりません。");
        }
        
        final int recovered = value + recoveryAmount;
        final int corrected = recovered > MAX ? MAX : recovered;
        return new HitPoint(corrected);
    }
    
        public int getValue() {
            return value;
        }
    
        public void setValue(int value) {
            this.value = value;
        }
    
}