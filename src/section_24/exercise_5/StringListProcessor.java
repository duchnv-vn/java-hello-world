package section_24.exercise_5;

import java.util.List;
import java.util.function.Consumer;

public class StringListProcessor {
    public static void convertAndPrint(List<String> inputString) {
        Consumer<String> upperCaseAndPrintFunc = (str) -> System.out.println(str.toUpperCase());
        inputString.forEach(upperCaseAndPrintFunc);
    }
}