package day03_0205;

public class Main {
    public static void main(String[] args) {
        System.out.println("****java nara CoffeeShop영업개시****");
        Beverge[] beverage = new Beverge[5];
        beverage[0] = new coffee("Cappuccino");
        beverage[1] = new coffee("CafeLatte");
        beverage[2] = new Tea("ginsengTea");
        beverage[3] = new coffee("CafeLatte");
        beverage[4] = new Tea("redginsengTea");
        getSalesInfo(beverage);
        //getTotalPrice(beverage);

        System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
        System.out.println("Coffe의 판매 개수=>"+coffee.amount+"잔");
        System.out.println("Tea의 판매 개수=>"+ Tea.amount+"잔");
    }
    public static int getTotalPrice(Beverge[] beverages) {
        int totalPrice = 0;
        for (Beverge beverage : beverages) {
            totalPrice += beverage.getPrice();
        }
        return totalPrice;
    }
    public static void getSalesInfo(Beverge[] beverages) {
        for (int i = 0; i < beverages.length; i++) {
            beverages[i].print(i + 1);
        }
    }


    }



