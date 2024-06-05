package section_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface PowerFunc {
    double exec(int a, int b);
}

public class Section24 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double> powerFunc = (a, b) -> Math.pow(a, b);
        Function<Double, Double> squareFunc = (a) -> a * a;
        Function<Double, Double> multi2Func = (a) -> a * 2;
        var customStream1 = powerFunc.andThen(squareFunc);
        var customStream2 = squareFunc.compose(multi2Func);
        var result = customStream1.apply(2, 3);
        var result1 = customStream2.apply(2.0);

        Function<Integer, String> checkEvenNumberFunc = (a) -> {
            boolean isEven = a % 2 == 0;
            return isEven ? "even" : "odd";
        };
        var result2 = checkEvenNumberFunc.apply(3);

        PowerFunc powerFunc2 = (a, b) -> Math.pow(a, b);
        powerFunc2.exec(2, 2);

        CheckEvenNumberFunc checkEvenNumberFunc2 = (a) -> {
            boolean isEven = a % 2 == 0;
            return isEven ? "even" : "odd";
        };
        var result3 = checkEvenNumberFunc2.exec(2);

        var result4 = powerExec(powerFunc2, 5, 6);
        var result5 = powerExec((a, b) -> Math.pow(a, b), 1, 0);

        Predicate<Integer> isEvenFunc = (a) -> a % 2 == 0;
        Predicate<Integer> isGreaterThan5 = (a) -> a > 5;
        var checkEvenAndGreaterThan5 = isEvenFunc.and(isGreaterThan5).test(20);

        Predicate<Integer> isOddFunc = Predicate.not(isEvenFunc);
        var checkOdd = isOddFunc.test(12);

        var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        var evenNumbers = numbers.stream().filter(isEvenFunc).toList();

        UnaryOperator<Integer> multiTenFunc = (a) -> a * 10;
        var result6 = multiTenFunc.apply(3);
    }

    public static double powerExec(PowerFunc func, int a, int b) {
        return func.exec(a, b);
    }
}
