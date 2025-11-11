package com.sfshin5.list3_18;

import java.util.Currency;

class Money {
    final int amount;
    final Currency currency;

    Money(final int amount, final Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("金額は0以上でなければなりません。");
        }
        if (currency == null) {
            throw new IllegalArgumentException("通貨単位を指定してください。");
        }

        this.amount = amount;
        this.currency = currency;
    }

    Money add(final Money other) {
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("異なる通貨単位同士では加算できません。");
        }

        final int added = amount + other.amount;
        return new Money(added, currency);
    }
}