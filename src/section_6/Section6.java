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

        // SPLITTING
        String originalString = "1,2,3,4,5";
        String[] splittedStrings = originalString.split(",");
        String joinedString = String.join(".", splittedStrings);

        // STRING FORMAT
        String messageFormat = "Hello %s, you have %d new messages.";
        String message1 = String.format(messageFormat, "Duc", 9);

        // MUTABLE STRING
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world.");
        String string1 = sb.toString();

        StringBuffer sb2 = new StringBuffer("hello");
        sb2.append(" world.");
        String string2 = sb.toString();

        // TEXT BLOCK
        String textBlock = """
                    <html>
                        <body>
                            <h1>Hello world.</h1>
                        </body>
                    </html>
                """;

        // STRING TO PRIMITIVE TYPE
        String strInteger = "123";
        int parsedInteger = Integer.parseInt(strInteger);

        String strDouble = "3.14";
        double parsedDouble = Double.parseDouble(strDouble);

        String strFloat = "1.23";
        float parsedFloat = Float.parseFloat(strFloat);

        String strLong = "123123123123123";
        long parsedLong = Long.parseLong(strLong);

        String strBoolean = "true";
        boolean parsedBoolean = Boolean.parseBoolean(strBoolean);

        String str = "Hello";
        char charFromStr = str.charAt(0);
    }
}