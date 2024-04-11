package section_4;

import java.text.MessageFormat;

public class Person {
  static private final String NATIONALITY = "Vietnam";
  private String firstName;
  private String lastName;
  private byte age;
  private String gender;
  private short dateOfBirth;

  {
    System.out.println("Person object is being created.");
  }

  public Person(String firstName, String lastName, byte age, String gender, String dateOfBirth) {
    System.out.println("Person object's constructor is running...");
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
  }

  public static void main(String[] args) {
    System.out.println("Person object's main method is running...");
  }

  public static String getNationality() {
    return NATIONALITY;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public byte getAge() {
    return this.age;
  }

  public String getGender() {
    return this.gender;
  }

  public short getDateOfBirth() {
    return this.dateOfBirth;
  }

  public String getFullName() {
    return MessageFormat.format("{0} {1}", this.firstName, this.lastName);
  }
}
