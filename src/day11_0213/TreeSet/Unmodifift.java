package day11_0213.TreeSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Unmodifift {
    public static void main(String[] args) {
        //수정할수없는 컬렉션 만드는 방법
        List<String> immutableList1 = List.of("A","B","C");
        //immutableList1.add("E");

//        Set<String> immutable = Set.of("A","B","C");
//        immutable.remove("C");
//
//        Map<Integer,String> immutableMap1 = Map.of(1,"A",2,"B",3,"C");
//        immutableMap1.put(4,"D");

        List<String> list2 = new ArrayList<>();
//        list2.add("A");
//        list2.add("B");
//        list2.add("C");
//        list2.add("D");
//        list2.add("E");
//        List<String> immutableList2 = List.copyOf(list2);

        //배열로부터 List 불변컬렉션으로 생성
        String array[] = {"A","B","C"};
        array[3] = "D";
        for(String s : array){
            System.out.println(s);
        }

    }
}
