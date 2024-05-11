package section_15;

public class Sectio15 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person("Duc", 25, "123456", new Job("SICK", "fullstack developer"));
        Person person2 = new Person("Duc", 25, "123456", new Job("SICK", "backend developer"));
        Person person3 = new Person("Duc3", 25, "456789", new Job("SICK", "frontend developer"));
        Person person4 = person1.clone();
        person4.setName("Duc4");
        person4.getJob().setPosition("data developer");

        boolean isSamePerson12 = person1.equals(person2);
        boolean isSamePerson13 = person1.equals(person3);

        System.out.println(person1);
        System.out.println(person4);
        // System.out.println(isSamePerson12);
        // System.out.println(isSamePerson13);
    }
}
