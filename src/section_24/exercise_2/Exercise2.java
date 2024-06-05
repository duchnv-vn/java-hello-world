package section_24.exercise_2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercise2 {
    public static List<Person> filterByAge(int age) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));

        Predicate<Person> isValidAge = (obj) -> obj.getAge() > age;
        var result = filter(persons, isValidAge);
        return result;
    }

    public static List<Person> filterByCity(String city) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 28, "New York"));
        persons.add(new Person("Jane", 22, "Los Angeles"));
        persons.add(new Person("Jack", 30, "New York"));
        persons.add(new Person("Jill", 24, "Chicago"));

        Predicate<Person> isValidCity = (obj) -> obj.getCity().equals(city);
        var result = filter(persons, isValidCity);
        return result;
    }

    public static List<Person> filter(List<Person> persons, Predicate<Person> predicate) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (predicate.test(person)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }
}
