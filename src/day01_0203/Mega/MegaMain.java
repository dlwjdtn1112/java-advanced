package day01_0203.Mega;

import day01_0203.ABCD.C;

public class MegaMain {
    public static void main(String[] args) {
        int sum = 0;
        Beverage[] b1 = new Beverage[5];
//        Coffee c1 = new Coffee("아메리카노");
//        Coffee.getAmount();
//        Coffee c2 = new Coffee("카푸치노");
//        Coffee.getAmount();
//        Coffee c3 = new Coffee("카페라뗴");
//        Coffee.getAmount();
//        c1.setPrice(3000);
//        c2.setPrice(2500);
//        c3.setPrice(2000);
//        int a = Coffee.getAmount();
//
//
//        sum += c1.getPrice();
//        sum += c2.getPrice();
//        sum += c3.getPrice();

        b1[0] = new Coffee("아메리카노");
        Coffee.getAmount();
        b1[1] = new Coffee("카푸치노");
        Coffee.getAmount();
        b1[2] = new Coffee("카페라뗴");
        Coffee.getAmount();
        b1[0].setPrice(3000);
        b1[1].setPrice(3000);
        b1[2].setPrice(2500);
        sum += b1[0].getPrice();
        sum += b1[1].getPrice();
        sum += b1[2].getPrice();
        int a = Coffee.getAmount();


        System.out.println("총 판매 금액 => " + sum);
        System.out.println();
        System.out.println("Coffee의 판매 개수 => "+(a-1)+"잔");






    }
}
