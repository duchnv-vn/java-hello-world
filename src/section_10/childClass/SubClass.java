package childClass;

import parentClass.SuperClass;

public class SubClass extends SuperClass {
    public SubClass() {
        this.setName("Masanori");
        this.setAge(27);
    }

    public void coding() {
        System.out.println(this.getName() + " is coding...");
    }

}
