import java.text.MessageFormat;

public class Section6 {
    public static void main(String[] args) {
        // COMPARISON
        String str1 = "hello";
        String str2 = "hello";
        String str3 = "hi";
        boolean compare1 = str1 == str2;
        boolean compare2 = str3 == str2;

        String str4 = new String("hello");
        String str5 = new String("hello");
        String str6 = new String("hi");
        boolean compare3 = str4 == str5;
        boolean compare4 = str4.equalsIgnoreCase(str5);
        boolean compare5 = str4.intern() == str5.intern();
        boolean compare6 = str6 == str5;
        boolean isBlank = "a".isBlank();

        // SEARCH VALUE
        String statement = "Hello everybody, my name is Duc Huynh. Nice to meet you!";
        String regex = ".*my name.*".toLowerCase();
        boolean isExist = statement.toLowerCase().matches(regex);
    }
}