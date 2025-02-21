package day15_0217.Pra;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();

        treeMap.put("apple",1000);
        treeMap.put("banana",2500);
        treeMap.put("Melon",3100);
        treeMap.put("pear",4300);
        treeMap.put("pear",4300);
        treeMap.put("pear",4300);
        treeMap.put("pear",4300);

        Set<Map.Entry<String,Integer>> entrySet1 = treeMap.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet1){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //Set<Map.Entry<String,Integer>> entry2 = treeMap.entrySet();
    }
}
