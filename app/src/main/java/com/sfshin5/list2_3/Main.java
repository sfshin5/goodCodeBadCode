package com.sfshin5.list2_3;

public class Main 
{
    public static void main( String[] args )
    {
        DamageCalculator  damageCalculator = new DamageCalculator ();

        int playerArmPower = 50;
        int playerWeaponPower = 70;
        int enemyBodyDefence = 40;
        int enemyArmorDefence = 30;

        int totalPlayerAttackPower = damageCalculator.sumUpPlayerAttackPower(playerArmPower, playerWeaponPower);
        int totalEnemyDefence = damageCalculator.sumUpEnemyDefence(enemyBodyDefence, enemyArmorDefence);
        int damage = damageCalculator.estimateDamage(totalPlayerAttackPower, totalEnemyDefence);

        System.out.println( "ダメージは" + damage + "です。" );
    }
}
