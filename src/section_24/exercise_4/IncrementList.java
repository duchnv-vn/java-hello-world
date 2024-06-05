package section_24.exercise_4;

import java.util.List;
import java.util.function.UnaryOperator;

public class IncrementList {
    public static List<Integer> incrementList(List<Integer> numbers, int incrementValue) {
        UnaryOperator<Integer> addFunc = (a) -> a + incrementValue;

        var result = numbers.stream().map(addFunc).toList();
        return result;
    }
}
