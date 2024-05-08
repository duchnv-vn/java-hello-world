package overloading;

public class SuperClass {
    public void method1(String input) {
        System.out.println("method 1 of Super class is executing with String argument: " + input);
    }

    public void method1(String input1, String input2) {
        System.out
                .println("method 1 of Super class is executing with 2 String arguments: " + input1 + " and " + input2);
    }
}
