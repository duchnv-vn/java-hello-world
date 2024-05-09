package section_11;

public class InterfaceDemo {
    public static void main(String[] args) {
        MeClass meClass = new MeClass();
        String fullName = meClass.getFullName("Duc", "Huynh");
        System.out.println(fullName);

    }
}
