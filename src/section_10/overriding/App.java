package overriding;

public class App {
    public static void main(String[] args) {
        // SubClass customClass = new SubClass();
        // customClass.method1();// DYNAMIC POLYMORPHISM

        SuperClass customClass2 = new SubClass();
        customClass2.method1();// DYNAMIC POLYMORPHISM

        if (customClass2 instanceof SubClass cc2) {
            cc2.method2();
        }

    }
}
