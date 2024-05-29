package section_20;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import static java.util.Map.entry;

public class Section20 {
    public static void main(String[] args) {
        // ------ HASHMAP INITIATION & DECLARATION
        // Map<String, String> countryMap = new HashMap<>();
        var countryMap2 = new HashMap<String, String>();
        countryMap2.put("usa", "Washington DC");
        countryMap2.put("vietnam", "Ha Noi");
        countryMap2.put("india", "New Delhi");
        countryMap2.put("vietnam", "Ha Noi 2");

        // ----------------- ITERATE HASMAP KEYS
        // iterateKey(countryMap2);
        // iterateKey2(countryMap2);
        // iterateKey3(countryMap2);

        // ----------------- ITERATE HASMAP VALUES
        // iterateValue(countryMap2);

        // ------ TREEMAP INITIATION & DECLARATION
        // var studentMap = new TreeMap<Integer, String>();
        // studentMap.put(10, "Duc 10");
        // studentMap.put(100, "Duc 100");
        // studentMap.put(0, "Duc 0");
        // studentMap.put(-100, "Duc -100");
        // studentMap.put(1, "Duc 1");
        // for (var entry : studentMap.entrySet()) {
        // System.out.println("key: " + entry.getKey());
        // System.out.println("value: " + entry.getValue());
        // }

        // ------ LINKEDHASHMAP INITIATION & DECLARATION
        // var nameMap = new LinkedHashMap<String, String>();
        // nameMap.put("home", "Home");
        // nameMap.put("contact", "Contact");
        // nameMap.put("aboutUs", "About us");
        // nameMap.put("products", "Products");
        // nameMap.put("services", "Services");
        // nameMap.put("projects", "Projects");
        // for (var entry : nameMap.entrySet()) {
        // System.out.println("key: " + entry.getKey());
        // System.out.println("value: " + entry.getValue());
        // }

        // ------ UNMODIFIED MAP
        // var unModifiedMap = Collections.unmodifiableMap(countryMap2);
        // var unmodifiableMap2 = Map.of(1, "A", 2, "B");
        // var unmodifiableMap3 = Map.ofEntries(entry(1, "A"), entry(2, "B"));

    }

    public static void iterateKey(HashMap<String, String> countryMap) {
        var keys = countryMap.keySet();

        for (var key : keys) {
            System.out.println("key:" + key);
            System.out.println("value:" + countryMap.get(key));
        }
    }

    public static void iterateKey2(HashMap<String, String> countryMap) {
        var iterator = countryMap.keySet().iterator();

        while (iterator.hasNext()) {
            var key = iterator.next();
            System.out.println("key:" + key);
            System.out.println("value:" + countryMap.get(key));
        }
    }

    public static void iterateKey3(HashMap<String, String> countryMap) {
        var entries = countryMap.entrySet();

        for (var entry : entries) {
            System.out.println("key:" + entry.getKey());
            System.out.println("value:" + entry.getValue());
        }
    }

    public static void iterateValue(HashMap<String, String> countryMap) {
        var values = countryMap.values();

        for (var value : values) {
            System.out.println("value 1:" + value);
        }

        var iterator = values.iterator();
        while (iterator.hasNext()) {
            var value = iterator.next();
            System.out.println("value 2:" + value);

        }
    }
}
