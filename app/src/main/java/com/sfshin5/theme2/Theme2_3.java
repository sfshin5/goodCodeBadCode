package com.sfshin5.theme2;

public class Theme2_3 {
    
    int sumUpPlayerAttackPower(int playerArmPower, int playerWeaponPower) {
        return playerArmPower + playerWeaponPower;
    }

    int sumUpEnemyDefence(int enemyBodyDefence, int enemyArmorDefence) {
        return enemyBodyDefence + enemyArmorDefence;
    }

    int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefence) {
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
        if (damageAmount < 0){
            return 0;
        }
        return damageAmount;
    }
}
