package parentClass;

import childClass.SubClass;

public class SuperClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(String food) {
        System.out.println(this.name + " is eating " + food);
    }
}