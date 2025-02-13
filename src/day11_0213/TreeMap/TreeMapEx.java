package day11_0213.TreeMap;


import java.util.*;

//
public class TreeMapEx {

    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();

        //엔트리 지정
        treeMap.put("apple",1000);
        treeMap.put("banana",1670);
        treeMap.put("Melon",3130);
        treeMap.put("grape",2400);
        treeMap.put("pear",3000);

        //정렬된 앤트리를 하니씩 가져오기
        Set<Map.Entry<String,Integer>> entrySet = treeMap.entrySet();
        for(Map.Entry<String,Integer> entry :entrySet){
            System.out.println(entry.getKey() + " : " + entry.getValue());


        }

        System.out.println();

        //특정 키에대한 값ㅇ르 가져오고 싶다.
        Map.Entry<String,Integer> entry = null;
        entry = treeMap.firstEntry();
        System.out.println("첫번째 : "+ entry.getValue());
        System.out.println("첫번째 : "+ entry.getKey());

        //내림차순 정렬하기
        NavigableMap<String,Integer> des = treeMap.descendingMap();
        //Set<Map.Entry<String,Integer>> des1 =


        //범위 검색



    }
}
