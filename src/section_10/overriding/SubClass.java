package section_10.overriding;

public class SubClass extends SuperClass {

    @Override
    public void method1() {
        System.out.println("method 1 of Sub class is executing...");
    }

    public void method2() {
        System.out.println("method 2 of Sub class is executing...");
        super.method1();
    }
}
