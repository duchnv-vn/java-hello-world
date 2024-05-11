package section_15;

import section_15.immutableClass.House;

public class Sectio15 {
    public static void main(String[] args) throws CloneNotSupportedException {
        var person1 = new Person("Duc", 25, "123456", new Job("SICK", "fullstack developer"),
                new House("123 Xa Lo Ha Noi, Thu Duc, HCM", 105));
        var person2 = new Person("Duc", 25, "123456", new Job("SICK", "backend developer"),
                new House("123 Xa Lo Ha Noi, Thu Duc, HCM", 105));
        var person3 = new Person("Duc3", 25, "456789", new Job("SICK", "frontend developer"),
                new House("123 Xa Lo Ha Noi, Thu Duc, HCM", 105));
        var person4 = person1.clone();
        person4.setName("Duc4");
        person4.getJob().setPosition("data developer");

        var isSamePerson12 = person1.equals(person2);
        var isSamePerson13 = person1.equals(person3);

        System.out.println(person1);
        System.out.println(person4);
        System.out.println(isSamePerson12);
        System.out.println(isSamePerson13);

    }
}
