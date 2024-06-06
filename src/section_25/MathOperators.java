package section_25;

public class MathOperators {

    static final MathOperators instance = new MathOperators();

    public static int staticAddHandler(int a, int b) {
        var result = a + b;

        System.out.println("result: " + result);
        return result;
    }

    public int instanceAddHandler(int a, int b) {
        var result = a + b;

        System.out.println("result: " + result);
        return result;
    }
}
