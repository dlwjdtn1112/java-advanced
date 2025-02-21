package day14_0216.Pra1;

import day01_0203.ABCD.C;

class Car{
    int price;
    String name;

    Car(){}
    Car(String name,int price){
        this.name = name;
        this.price = price;
    }



}

public class Main2 {


    public static void main(String[] args) {
        Car c1 = new Car("아반떼",3000);
        Car c2 = new Car("소나타",4500);
        printCar(c1);
        printCar(c2);




    }
    public static void printCar(Car car1){
        System.out.println("현재 자동차 : " + car1.name + "현재 자동차 가격 : " + car1.price );
    }

}

