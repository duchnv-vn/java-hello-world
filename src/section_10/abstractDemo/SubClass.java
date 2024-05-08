package abstractDemo;

public class SubClass extends SuperClass {

    @Override
    void method1() {
        System.out.println("Method 1 is executing with non-agurment");
    }

    @Override
    void method1(String input) {
        System.out.println("Method 1 is executing with 1 String argument: " + input);
    }

    @Override
    void method1(int input) {
        System.out.println("Method 1 is executing with 1 integer argument: " + input);
    }

    @Override
    void method2() {
        System.out.println("Method 2 is executing with non-agurment");
    }

}
