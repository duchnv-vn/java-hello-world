import java.util.ArrayList;

public class Section19 {
    public static void main(String[] args) {
        var class1 = new GenericClass<String, Integer>("Duc Huynh", 27);

        class1.setSecond(28);
        class1.setFirst("Huynh Nguyen Viet Duc");

        String firstValue = class1.getFirst();
        int secondValue = class1.getSecond();

        String[] names = { "AAA", "BBB" };
        printArray(names);
        Integer[] numbers = { 7, 4, 9, 0, 3 };
        printArray(numbers);

        var subClass = new ArrayList<SubClass>();
        printArray2(subClass);

        var superClass = new ArrayList<SuperClass>();
        printArray3(superClass);

        var stringList = new ArrayList<String>();
        printArray4(stringList);

    }

    public static <T> void printArray(T[] array) {
        for (var item : array) {
            System.out.println(item);
        }
    }

    public static void printArray2(ArrayList<? extends SuperClass> list) {
        // list.add(new SubClass()); // No be able to add new item
        System.out.println(list);
    }

    public static void printArray3(ArrayList<? super SubClass> list) {
        list.add(new SubClass()); // Be able to add new item
        System.out.println(list);
    }

    public static void printArray4(ArrayList<?> list) {
        // list.add(new SubClass()); // No be able to add new item
        System.out.println(list);
    }
}