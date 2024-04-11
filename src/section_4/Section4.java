package section_4;

public class Section4 {
  public static void main(String[] args) {
    Person user1 = new Person("Duc", "Huynh", (byte) 27, "male", "1997-06-03");

    System.out.println(user1.getFullName());
    System.out.println(Person.getNationality());
  }
}
