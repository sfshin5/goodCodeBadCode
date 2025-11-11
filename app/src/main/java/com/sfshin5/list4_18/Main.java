package com.sfshin5.list4_18;

public class Main 
{
    public static void main( String[] args ){

        final AttackPower attackPowerA = new AttackPower(20);
        final AttackPower attackPowerB = new AttackPower(20);

        final Weapon weaponA = new Weapon(attackPowerA);
        final Weapon weaponB = new Weapon(attackPowerB);

        final AttackPower increment = new AttackPower(5);
        final Weapon enhancedWeaponA = weaponA.enhance(increment);

        System.out.println("武器Aの攻撃力（強化前）：" + weaponA.attackPower.value);
        System.out.println("武器Bの攻撃力（強化前）：" + weaponB.attackPower.value);
        System.out.println("武器Aの攻撃力（強化後）：" + enhancedWeaponA.attackPower.value);
    }
}