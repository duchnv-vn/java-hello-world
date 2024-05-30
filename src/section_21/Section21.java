import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Section21 {
    public static void main(String[] args) {
        var duplicatedNames = new ArrayList<String>();
        duplicatedNames.add("vietnam");
        duplicatedNames.add("usa");
        duplicatedNames.add("vietnam");
        duplicatedNames.add("japan");
        duplicatedNames.add("japan");
        duplicatedNames.add("korea");

        duplicatedNames.forEach(name -> {
            // System.out.println("name: " + name);
        });

        // HASH SET
        var uniqueNames = new HashSet<String>(duplicatedNames);

        // SET ITERATE
        var iterator = uniqueNames.iterator();
        while (iterator.hasNext()) {
            var name = iterator.next();
            // System.out.println(name);
        }

        for (String name : uniqueNames) {
            // System.out.println(name);
        }

        uniqueNames.forEach(name -> {
            // System.out.println(name);
        });

        // TREE SET
        var treeSet1 = new TreeSet<Integer>();

        // LINKED HASH SET
        var linkedHashSet1 = new LinkedHashSet<String>();

        // IMMUTABLE SET
        var immutableSet1 = Collections.unmodifiableSet(uniqueNames);
        var immutableSet2 = Set.of(uniqueNames);
    }
}