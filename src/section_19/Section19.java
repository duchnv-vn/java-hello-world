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

    }

    public static <T> void printArray(T[] array) {
        for (var item : array) {
            System.out.println(item);
        }
    }

    public static void printArray2(ArrayList<? extends SuperClass> list) {
        System.out.println(list);
    }
}