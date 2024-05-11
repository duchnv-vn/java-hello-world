package section_15;

import java.text.MessageFormat;
import java.util.Objects;

public class Person implements Cloneable {
    private String name;
    private int age;
    private String idCardNumber;
    private Job job;

    public Person(String name, int age, String idCardNumber, Job job) {
        this.name = name;
        this.age = age;
        this.idCardNumber = idCardNumber;
        this.job = job;
    }

    @Override
    public String toString() {
        String format = """
                -------------------------------------
                name: {0}
                age: {1}
                idCardNumber: {2}
                company: {3}
                position: {4}
                -------------------------------------
                """;

        return MessageFormat.format(format, name, age, idCardNumber, job.getCompanyName(), job.getPosition());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, idCardNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || (this.getClass() != obj.getClass())) {
            return false;
        }

        Person person = (Person) obj;
        return (person.getIdCardNumber() == this.getIdCardNumber())
                && person.getName().equals(this.getName())
                && (person.getAge() == this.getAge());
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person clone = (Person) super.clone();
        clone.job = job.clone();
        return clone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
