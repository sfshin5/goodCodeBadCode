package com.sfshin5.list2_9;

public class Main 
{
    public static void main( String[] args ){

        HitPoint hitPoint = new HitPoint(100);
        System.out.println("現在のHPは" + hitPoint.getValue() + "です。");

        try {
            hitPoint = hitPoint.damage(50);
            System.out.println("50のダメージを受けました。現在のHPは" + hitPoint.getValue() + "です。");

            hitPoint = hitPoint.recover(30);
            System.out.println("30回復しました。現在のHPは" + hitPoint.getValue() + "です。");

            hitPoint = hitPoint.damage(-10);
            System.out.println("-10のダメージを受けました。現在のHPは" + hitPoint.getValue() + "です。");
        } catch (Exception e) {
            System.out.println("エラーが発生しました: " + e.getMessage());
        }

    }
}
