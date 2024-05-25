package section_20.exercise;

import java.util.*;

public class Exercise {

    public static Map<String, Integer> wordsLength() {
        List<String> words = List.of("apple", "banana", "orange", "grape", "kiwi");

        var fruitMap = new HashMap<String, Integer>();

        for (var word : words) {
            fruitMap.put(word, word.length());
        }

        var entries = fruitMap.entrySet();
        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getKey());
        }

        return fruitMap;
    }

}
