package day10_0212.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        //객체 저장
        set.add("Java234");
        set.add("Java34");
        set.add("Java45");
        set.add("Java1");
        set.add("Java2");
        set.add("Java3");
        set.add("Python");
        set.add("C++");
        set.add("C#");

        int size = set.size();
        System.out.println(size);


    }
}
