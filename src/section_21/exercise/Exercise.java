package exercise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise {
    public static Set<String> removeVowelWords() {
        var fruitNames = new HashSet<String>();
        fruitNames.addAll(Arrays.asList("apple", "banana", "orange", "lynx", "grape"));

        CharSequence[] checkList = { "u", "e", "o", "a", "i" };

        var iterator = fruitNames.iterator();
        while (iterator.hasNext()) {
            var name = iterator.next();

            for (CharSequence c : checkList) {
                if (name.contains(c)) {
                    iterator.remove();
                    break;
                }
            }
        }

        return fruitNames;
    }
}
