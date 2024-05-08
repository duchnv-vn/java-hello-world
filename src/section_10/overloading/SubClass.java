package overloading;

public class SubClass extends SuperClass {
    public SubClass() {

    }

    @Override
    public void method1(String input) {
        System.out.println("method 1 of Sub class is executing with String argument: " + input);
    }

    public void method1(Integer input) {
        System.out.println("method 1 of Super class is executing with Integer argument: " + input);
    }

    public void method1(Integer input1, Integer input2) {
        System.out
                .println("method 1 of Super class is executing with 2 Integer arguments: " + input1 + " and " + input2);
    }

    public static void start() {
        System.out.println("Sub class is starting...");
    }

}
