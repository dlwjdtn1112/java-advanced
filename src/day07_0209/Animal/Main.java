package day07_0209.Animal;

import day01_0203.ABCD.D;

public class Main {
    public static void main(String[] args) {
        Dog[] dog = new Dog[4];

        dog[0] = new Dog("바둑이",34);
        dog[1] = new Dog("멍멍이",30);
        dog[2] = new Dog("강아지",12);
        dog[3] = new Dog("파피",33);

        for(Dog d : dog){
            d.makesound();
            d.move();
            System.out.println("---");
        }
        //int v1 = dog[0].getAmount();
        System.out.println(dog[0].getAmount());
    }
}
