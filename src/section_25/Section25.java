package section_25;

public class Section25 {

    public static void main(String[] args) {
        // TRADITIONAL WAY
        AddFunc addFunc1 = (a, b) -> {
            var result = a + b;

            System.out.println("result: " + result);
            return result;
        };
        var addResult1 = addFunc1.exec(2, 3);

        // METHOD REFERENCE WAY
        AddFunc addFunc2 = MathOperators::addHandler;
        var addResult2 = addFunc1.exec(2, 3);
    }

}
