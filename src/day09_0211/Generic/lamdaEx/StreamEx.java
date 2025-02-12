package day09_0211.Generic.lamdaEx;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class StreamEx {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("dfsgdsg","sdflkjsdg","sdgsdg","Java");

        List<String> filterWords = words.stream()
                .filter(word -> word.length() > 8)
                .map(word -> word.toUpperCase())
                .toList();

        System.out.println(filterWords);

    }
}
