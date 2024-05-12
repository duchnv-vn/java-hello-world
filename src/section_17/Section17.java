package section_17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Section17 {
    public static void main(String[] args) {
        // LIST COLLECTION
        // ARRAY LIST
        var countryNames = new ArrayList<String>();
        countryNames.add("Vietnam");
        countryNames.addFirst("USA");
        countryNames.addLast("Japan");
        countryNames.remove("Japan");
        countryNames.removeLast();

        // IMMUTABLE ARRAY LIST
        List<String> bankAccounts = new ArrayList<String>();
        bankAccounts.add("123456");
        bankAccounts.add("234567");
        bankAccounts.add("345678");
        // Method 1 - JDK 8
        bankAccounts = accessImmutatbleArrayList(Collections.unmodifiableList(bankAccounts));

        // Method 2 - JDK 9
        bankAccounts = accessImmutatbleArrayList(List.copyOf(bankAccounts));

        // bankAccounts.add("567890"); // CAN NOT MODIFY LIST

        System.out.println(bankAccounts);

        // ------------------------------------------------
        // LINKED LIST
    }

    private static List<String> accessImmutatbleArrayList(List<String> list) {
        // list.add("456789"); // CAN NOT MODIFY LIST

        for (var item : list) {
            System.out.println("access item: " + item);
        }

        return list;
    }
}
