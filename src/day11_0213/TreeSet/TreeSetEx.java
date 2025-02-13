package day11_0213.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        //TreeSet 켈렉션 생성
        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(90);
        scores.add(98);
        scores.add(95);
        scores.add(91);
        scores.add(90);

        for(Integer score :scores ) System.out.println(score + "점");

        System.out.println("우리 반 꼴등 : "+ scores.first());
        System.out.println("우리 반 꼴등 : "+ scores.last());
        System.out.println("95점 바로 아래 : "+ scores.lower(95));
        System.out.println("우리 반 일등 : "+ scores.floor(95));


        System.out.println("===================================");

        //검색
        NavigableSet<Integer> desScore = scores.descendingSet();
        for(Integer s : desScore){

            System.out.println(s + "점");

        }

        //범위 김색(ex 80 <= )
        NavigableSet<Integer> rangeSet = scores.tailSet(80,true);
        for(Integer s : rangeSet){
            System.out.println(s);
        }
        System.out.println("===");

        //범위 검색(80 <= score < 90)
        rangeSet = scores.subSet(80,true,90,false);

        for(Integer s : rangeSet){
            System.out.println(s);
        }

    }
}
