package com.sfshin5.list5_11;

public class Main 
{
    public static void main( String[] args ){

        GiftPoint standardMemberShipPoint = GiftPoint.forStandardMembership();
        GiftPoint premiumMemberShipPoint = GiftPoint.forPremiumMembership();

        System.out.println("標準会員向け入会ギフトポイントは" + standardMemberShipPoint.value + "ポイントです。");
        System.out.println("プレミアム会員向け入会ギフトポイントは" + premiumMemberShipPoint.value + "ポイントです。");
    }
}