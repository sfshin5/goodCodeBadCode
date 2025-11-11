package com.sfshin5.list3_18;

public class Main 
{
    public static void main( String[] args )
    {
        java.util.Currency jpy = java.util.Currency.getInstance("JPY");
        java.util.Currency usd = java.util.Currency.getInstance("USD");

        Money money1 = new Money(100, jpy);
        Money money2 = new Money(200, jpy);
        Money money3 = money1.add(money2);
        System.out.println("合計金額は " + money3.amount + " " + money3.currency.getCurrencyCode() + " です。");
        try {
            Money money4 = new Money(50, usd);
            Money money5 = money1.add(money4);
            System.out.println("合計金額は " + money5.amount + " " + money5.currency.getCurrencyCode() + " です。");
        } catch (Exception e) {
            System.out.println("エラーが発生しました: " + e.getMessage());
        }
    }
}