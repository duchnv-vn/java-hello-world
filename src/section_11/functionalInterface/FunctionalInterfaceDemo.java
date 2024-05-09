package section_11.functionalInterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        MyFunctionalInterface myMethod = () -> System.out.println("my functional method is executing...");
        myMethod.myMethod();
    }
}
