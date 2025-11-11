package com.sfshin5.list4_18;

class Weapon {
    final AttackPower attackPower;

    Weapon(final AttackPower attackPower) {
        this.attackPower = attackPower;
    }

    Weapon enhance(final AttackPower increment){
        final AttackPower enhanced = attackPower.enhance(increment);
        return new Weapon(enhanced);
    }

}