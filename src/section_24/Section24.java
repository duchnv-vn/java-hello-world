package section_24;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Section24 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> powerFunc = (a, b) -> Math.pow(a, b);

        Function<Integer, String> checkEvenNumberFunc = (a) -> {
            boolean isEven = a % 2 == 0;
            return isEven ? "even" : "odd";
        };

        System.out.println(powerFunc.apply(2, 3));
        System.out.println(checkEvenNumberFunc.apply(3));
        System.out.println(checkEvenNumberFunc.apply(2));
    }
}
