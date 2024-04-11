package section_4;

import java.text.MessageFormat;

public class Person {
  private String firstName;
  private String lastName;
  private byte age;
  private String gender;
  private short dateOfBirth;

  public Person(String firstName, String lastName, byte age, String gender, String dateOfBirth) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.gender = gender;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public byte getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }

  public short getDateOfBirth() {
    return this.dateOfBirth;
  }

  public String getFullName() {
    return MessageFormat.format("{0} {1}", this.firstName, this.lastName);
  }
}
