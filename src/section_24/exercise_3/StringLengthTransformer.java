package section_24.exercise_3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class StringLengthTransformer {
    public static List<Integer> transformStringLengths(List<String> strings) {
        Function<String, Integer> getStringLen = (text) -> text.length();
        var result = new ArrayList<Integer>();

        strings.forEach(str -> result.add(getStringLen.apply(str)));
        return result;
    }
}
