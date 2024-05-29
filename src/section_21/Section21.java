import java.util.ArrayList;
import java.util.HashSet;

public class Section21 {
    public static void main(String[] args) {
        var duplicatedNames = new ArrayList<String>();
        duplicatedNames.add("vietnam");
        duplicatedNames.add("usa");
        duplicatedNames.add("vietnam");
        duplicatedNames.add("japan");
        duplicatedNames.add("japan");
        duplicatedNames.add("korea");

        var uniqueNames = new HashSet<String>(duplicatedNames);
        var iterator = uniqueNames.iterator();
        while (iterator.hasNext()) {
            var name = iterator.next();
            // System.out.println(name);
        }

        for (String name : uniqueNames) {
            // System.out.println(name);
        }

        uniqueNames.forEach(name -> {
            System.out.println(name);
        });

    }
}