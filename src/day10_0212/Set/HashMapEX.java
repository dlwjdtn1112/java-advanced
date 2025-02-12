package day10_0212.Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEX {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        //객체 저장
        map.put("JAVA프로그래밍",100);
        map.put("Python프로그래밍",97);
        map.put("C++ 프로그래밍",100);
        //map.put("JAVA프로그래밍",100);
        System.out.println(map.size());
        System.out.println("===========================");

        //키로 값을 받기
        String key  = "Python프로그래밍";
        int value = map.get(key);
        System.out.println(key);
        //
        Set<String> keySet = map.keySet();
        Iterator<String> keyiter = keySet.iterator();
        while (keyiter.hasNext()){
            String k = keyiter.next();
            Integer v = map.get(k);
            System.out.println( k + " : " + v);
        }
        //String name = map.remove(k);
        while (keyiter.hasNext()){
            String k = keyiter.next();
            Integer v = map.get(k);
            System.out.println( k + " : " + v);
        }
    }

}
