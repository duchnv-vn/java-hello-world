package overloading;

public class App {
    public static void main(String[] args) {
        SubClass customClass = new SubClass();
        customClass.method1("Masanori", "fullstack developer"); // STATIC POLYMORPHISM
    }
}
