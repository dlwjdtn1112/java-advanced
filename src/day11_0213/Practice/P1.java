package day11_0213.Practice;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map1 = new HashMap<>();

        map.put("apple",10);
        map.put("banana",20);
        map.put("cherry",30);

        map1.put(1,3);
        map1.put(3,7);
        map1.put(6,3);

//        for(Map.Entry<String,Integer> entry : map.entrySet()){
//            System.out.println("key = " + entry.getKey() + " , value = " + entry.getValue());
//
//        }

        for(Map.Entry<Integer,Integer> entry : map1.entrySet()){
            System.out.println("key = " + entry.getKey() +" , value = " + entry.getValue());
        }
        System.out.println(map1.get(1));

        HashMap<Integer,String> hash = new HashMap<>();
        hash.put(3,"이정수");
        hash.put(1,"김정수");
        hash.put(2,"박정수");
        //hash.put(4,"ㅇㄹㄴ");

    }
}
