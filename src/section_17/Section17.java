package section_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import section_17.exercise_1.TaskManager;

public class Section17 {
    public static void main(String[] args) {
        // LIST COLLECTION
        // ARRAY LIST
        var countryNames = new ArrayList<String>();
        countryNames.add("Uruguay");
        countryNames.add("Vietnam");
        countryNames.add("USA");
        countryNames.add("Japan");
        countryNames.add("Japan");

        // IMMUTABLE ARRAY LIST
        var bankAccounts = new ArrayList<String>();
        bankAccounts.add("123456");
        bankAccounts.add("234567");
        bankAccounts.add("345678");
        // Method 1 - JDK 8
        // bankAccounts =
        // accessImmutatbleArrayList(Collections.unmodifiableList(bankAccounts));
        // Method 2 - JDK 9
        // bankAccounts = accessImmutatbleArrayList(List.copyOf(bankAccounts));
        // bankAccounts.add("567890"); // CAN NOT MODIFY LIST

        // ITERATOR
        // Iterator<String> iterator = bankAccounts.iterator();
        // while (iterator.hasNext()) {
        // String account = iterator.next();
        // System.out.println("account: " + account);
        // }

        // LIST ITERATOR
        // ListIterator<String> listIterator = bankAccounts.listIterator();
        // while (listIterator.hasNext()) {
        // String account = listIterator.next();
        // System.out.println("account: " + account);
        // }
        // while (listIterator.hasPrevious()) {
        // String account = listIterator.previous();
        // System.out.println("account: " + account);
        // }

        // LIST SORTING
        var numbers = new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(-5);
        numbers.add(-59);
        numbers.add(101);
        numbers.add(1000);
        numbers.add(1);
        // System.out.println("BEFORE: " + numbers);
        // Collections.sort(numbers); // INCREMENT
        // System.out.println("AFTER 1: " + numbers);
        // Collections.sort(numbers, Comparator.reverseOrder()); // DECREMENT
        // System.out.println("AFTER 2: " + numbers);

        // System.out.println("BEFORE: " + countryNames);
        // countryNames.sort(Comparator.naturalOrder()); // INCREMENT
        // System.out.println("AFTER 1: " + countryNames);
        // countryNames.sort(Comparator.reverseOrder()); // DECREMENT
        // System.out.println("AFTER 2: " + countryNames);

        // System.out.println("BEFORE: " + countryNames);
        // countryNames.sort(new LastCharComparator()); // INCREMENT
        // System.out.println("AFTER: " + countryNames);

        // CUSTOM COMPARISON LOGIC
        // var students = new ArrayList<Student>();
        // students.add(new Student("CCC", "Huynh", "33333", "A1", 7.1f));
        // students.add(new Student("AAA", "Huynh", "11111", "A1", 3.5f));
        // students.add(new Student("BBB", "Huynh", "55555", "A1", 6.5f));
        // students.add(new Student("EEE", "Huynh", "66666", "A1", 6.5f));
        // students.add(new Student("DDD", "Huynh", "44444", "A1", 0.5f));
        // System.out.println("BEFORE: \n" + students);
        // students.sort(null);
        // students.sort(new StudentSortingByGrade());
        // Collections.sort(students, new StudentSortingByGrade());
        // System.out.println("AFTER: \n" + students);

        // CONVERT ARRAY-LIST TO ARRAY
        var countries = countryNames.toArray(new String[countryNames.size()]);
        System.out.println("countries: " + Arrays.toString(countries));

        // CONVERT ARRAY TO ARRAY-LIST
        List<String> newCountriesList = new ArrayList<String>();
        newCountriesList = Arrays.asList(countries);
        System.out.println("newCountriesList: " + newCountriesList);

        // ------------------------------------------------
        // LINKED LIST

        // CODING EXERCISE 1
        // TaskManager.makeToDoList();
    }

    private static List<String> accessImmutatbleArrayList(List<String> list) {
        // list.add("456789"); // CAN NOT MODIFY LIST

        for (var item : list) {
            System.out.println("access item: " + item);
        }

        return list;
    }
}
