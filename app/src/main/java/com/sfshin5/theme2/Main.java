package com.sfshin5.theme2;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        Theme2_3 theme = new Theme2_3();

        int playerArmPower = 50;
        int playerWeaponPower = 70;
        int enemyBodyDefence = 40;
        int enemyArmorDefence = 30;

        int totalPlayerAttackPower = theme.sumUpPlayerAttackPower(playerArmPower, playerWeaponPower);
        int totalEnemyDefence = theme.sumUpEnemyDefence(enemyBodyDefence, enemyArmorDefence);
        int damage = theme.estimateDamage(totalPlayerAttackPower, totalEnemyDefence);

        System.out.println( "ダメージは" + damage + "です。" );
    }
}
