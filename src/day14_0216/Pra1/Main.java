package day14_0216.Pra1;

import java.util.function.Predicate;
import java.util.function.Consumer;

@FunctionalInterface
interface MyFunction{
    int calculate(int a,int b);
}



public class Main {
    public static void main(String[] args) {
        MyFunction add = (a,b) -> a + b;
        MyFunction multiply = (a,b) -> a * b;

        System.out.println("두수의 합 : " + add.calculate(3,4));
        System.out.println("두수의 곱 : " + multiply.calculate(3,4));
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEven.test(7));
        System.out.println("Is 10 even? " + isEven.test(10));

        Consumer<String> printMseeage = message -> System.out.println("Message : "+ message);
        printMseeage.accept("Hello, Functional Interface!");

    }

}
