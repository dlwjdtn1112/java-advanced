package day10_0212.lamdaPra.Pra;

import java.util.Arrays;
import java.util.List;

public class LambdaStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        for(Integer n : numbers){
            System.out.println(n);
        }

        numbers.forEach(n -> System.out.println("숫자 : " + n));
        numbers.stream()
                .filter(n -> n%2 == 0).map(n -> n*n).forEach(n -> System.out.println("짝수의 제곱 : " + n));


        Integer[] arr = {1,2,3};
        List<Integer> list = Arrays.asList(arr);
        System.out.println(list.size());
        System.out.println(list.get(1));



    }
}
