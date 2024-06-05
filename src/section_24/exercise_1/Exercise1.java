package section_24.exercise_1;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static List<String> transformStringList() {
        StringTransformer stringTransformer = (input) -> input.toUpperCase();

        List<String> result = new ArrayList<>();
        List<String> words = List.of("hello", "world", "java", "lambda");

        words.forEach(word -> result.add(stringTransformer.transform(word)));
        return result;
    }
}
