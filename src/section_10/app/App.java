package app;

import childClass.SubClass;
import parentClass.SuperClass;

public class App {

    public static void main(String[] args) {

        SubClass subClass = new SubClass();
        subClass.eat("Pho");

        SuperClass customClass;
        customClass = new SubClass(); // UP CASTING
        customClass.eat("Bun rieu");

        SuperClass customClass2;
        SuperClass customClass5 = new SuperClass();
        SubClass customClass3 = new SubClass();
        customClass2 = customClass3;

        if (customClass2 instanceof SubClass) {// WILL RUN
            SubClass customeClass4 = (SubClass) customClass2; // DOWN CASTING
            customeClass4.coding();
        }
        if (customClass5 instanceof SubClass) {// WILL NOT RUN
            SubClass customeClass4 = (SubClass) customClass5;
            customeClass4.coding();
        }

        // instanceof for Java version 16 and above
        if (customClass2 instanceof SubClass customClass6) {
            customClass6.coding();
        }
        if (customClass5 instanceof SubClass customClass7) {
            customClass7.coding();
        }

        /* Static binding */ SuperClass customClass8 = new SubClass() /* Dynamic binding */;
        customClass8.eat("My goi");
    }

}