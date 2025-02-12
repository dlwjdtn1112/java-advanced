package day10_0212.lamdaPra.ListEx;

import java.util.*;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("갤럭시s25",12000000);
        Product p2 = new Product("아이폰16pro",13400000);
        Product p3 = new Product("Lg폰",13400000);
        Product p4 = new Product("갤럭시s24FE",8300000);
        Product p5 = new Product("갤럭시s24플러스",13400000);
        Product p6 = new Product("갤럭시s25울트라",16000000);
        Product p7 = new Product("갤럭시s25플러스",13400000);

        //list 시점
        List<Product> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
//        list.add(p3);

        System.out.println("정렬 전");

        list.forEach(System.out::println);

        Collections.sort(list);
        System.out.println("정렬 후");

        list.forEach(System.out::println);

        //배열[] 사용
        Product[] product = {p1,p2,p3,p4,p5,p6,p7};
        System.out.println("배열 정렬 전 : ");
        Arrays.stream(product).forEach(System.out::println);

        Arrays.sort(product);
        System.out.println("배열 정렬 후 : ");
        Arrays.stream(product).forEach(System.out::println);

    }
}
