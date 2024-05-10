package overloading;

public class App {
    public static void main(String[] args) {
        SubClass customClass = new SubClass();
        customClass.method1("Masanori", "fullstack developer"); // STATIC POLYMORPHISM

        // METHOD HIDING
        SuperClass customClass2 = new SuperClass();

        SubClass.start(); // 1 = Sub class is starting...
        customClass.start(); // 2 = Sub class is starting...

        SuperClass.start(); // 3 = Super class is starting...
        customClass2.start(); // 4 = Super class is starting...

        ((SuperClass) customClass).start(); // 5 = Super class is starting...

        customClass2 = customClass;
        customClass2.start(); // 6 = Super class is starting...
        ((SubClass) customClass2).start(); // 6 = Sub class is starting...
    }
}