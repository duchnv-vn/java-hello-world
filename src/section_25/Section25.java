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

        // STATIC METHOD REFERENCE WAY
        AddFunc addFunc2 = MathOperators::staticAddHandler;
        var addResult2 = addFunc2.exec(2, 3);

        // INSTANCE METHOD REFERENCE WAY
        var mathOperators = new MathOperators();
        AddFunc addFunc3 = mathOperators::instanceAddHandler;
        var addResult3 = addFunc3.exec(2, 3);

        // CLASS METHOD REFERENCE WAY
        AddFunc addFunc4 = MathOperators.instance::instanceAddHandler;
        var addResult4 = addFunc4.exec(2, 3);

        // CONTRUCTION REFERENCE WAY
        ProductInterface contructorReference = Product::new;
        var product1 = contructorReference.geProduct("AAA", 100000);
        System.out.println("product1: " + product1);
    }

}
