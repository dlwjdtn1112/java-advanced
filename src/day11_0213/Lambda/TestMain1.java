//package day11_0213.Lambda;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.function.Function;
//
//
//public class TestMain1 {
//    public static void main(String[] args) {
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello world");
//            }
//        };
//
//
//        Runnable runnable1 = () -> System.out.println("Hello World");
//
//        Function<String,Integer> stringLength = String::length;
//        List<String> names = Arrays.asList("Alics","Bob");
//        //names.forEach(System.out.println());
//
//        Runnable task1 =  () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Hello World");
//
//            }
//
//
//        };
//
//        Runnable task2 =  () -> {
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Hello Java");
//
//            }
//
//        };
//        Thread thread1 = new Thread(task1);
//        Thread thread2 = new Thread(task2);
//        thread1.start();
//        thread2.start();
//
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        numbers.stream().filter(num -> num % 2 ==0).forEach(System.out::println);
//
//
//    }
//}
