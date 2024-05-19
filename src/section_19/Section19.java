
public class Section19 {
    public static void main(String[] args) {
        var class1 = new GenericClass<String, Integer>("Duc Huynh", 27);

        class1.setSecond(28);
        class1.setFirst("Huynh Nguyen Viet Duc");

        String firstValue = class1.getFirst();
        int secondValue = class1.getSecond();

    }
}