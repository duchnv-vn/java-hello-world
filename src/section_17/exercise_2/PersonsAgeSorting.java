package section_17.exercise_2;

import java.util.ArrayList;
import java.util.List;

public class PersonsAgeSorting {

    public static List<Person> sortPersonsUsingAge() {
        var persons = new ArrayList<Person>();
        persons.add(new Person("James", 65));
        persons.add(new Person("Sneha", 34));
        persons.add(new Person("Jenna", 30));
        persons.add(new Person("Harry", 29));

        persons.sort(null);

        return persons;
    }

}