package day09_0211.Generic.lamdaEx;

public class Main {
    //해당 코드에서 제너릭의 역할 : 타입의 정확성을 보장하여 유연성을 제공하는 방법으로 사용된다.
    public static void main(String[] args) {
        Transfermer<Integer,String> intToString = (input -> "Number : " + input);
        String result = intToString.transfer(10);
        System.out.println(result.toString()); //int -> string
        System.out.println(result.toString() + 1);

        Transfermer<String, Integer> stringToLength = (String input) -> input.length();
        Integer length = stringToLength.transfer("Hello Java Programming");
        System.out.println(length);


    }
}
