package setion_2;

class Main {
    public static void main(String[] args) {
        boolean booleanVar = true;
        booleanVar = false;
        System.out.println("booleanVar: " + booleanVar);

        String stringVar = "Hello world, JAVA";
        System.out.println("stringVar: " + stringVar);

        byte negativeByteVar = -128;
        byte positiveByteVar = 127;
        System.out.println("negativeByeVar:" + negativeByteVar);
        System.out.println("positiveByeVar:" + positiveByteVar);

        short negativeShortVar = -32768;
        short positiveShortVar = 32767;
        System.out.println("negativeShortVar: " + negativeShortVar);
        System.out.println("positiveShortVar: " + positiveShortVar);

        int negativeIntVar = -2147483648;
        int positiveIntVar = 2147483647;
        System.out.println("negativeInitVar: " + negativeIntVar);
        System.out.println("positiveIntVar: " + positiveIntVar);

        long longVar = 999999999999999999L;
        System.out.println("longVar: " + longVar);

        float floatVar = 3.555999F;
        System.out.println("floatVar: " + floatVar);

        double doubleVar = 2.999111;
        System.out.println("doubleVar: " + doubleVar);

        char lowerCaseCharVar = Character.toLowerCase('D');
        System.out.println("lowerCaseCharVar: " + lowerCaseCharVar);

        char digitCharVar = '1';
        boolean isDigitValue = Character.isDigit(digitCharVar);
        System.out.println("isDigitValue: " + isDigitValue);

        char unicodeNumVar = 1;
        System.out.println("unicodeNumVar: " + unicodeNumVar);
    }
}