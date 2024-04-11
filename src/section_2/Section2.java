package section_2;

public class Section2 {
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

        int octalNumberVar = 0567; // 7*8^0 + 6*8^1 + 5*8^2 = 375
        System.out.println("octalNumberVar: " + octalNumberVar);

        int hexaNumberVar = 0x1A3; // 3*16^0 + 10*16^1 + 1*16^2 = 419
        System.out.println("hexaNumberVar: " + hexaNumberVar);

        int binaryNumberVar = 0b1101; // 1*2^0 + 0*2^1 + 1*2^2 + 1*2^3 = 13
        System.out.println("binaryNumberVar: " + binaryNumberVar);

        float testNarrowingFloatVar1 = 3.49f;
        int testNarrowingIntVar1 = (int) testNarrowingFloatVar1;
        System.out.println("testNarrowingFloatVar1: " + testNarrowingFloatVar1);
        System.out.println("testNarrowingIntVar1: " + testNarrowingIntVar1);

        float testNarrowingFloatVar2 = 3.999f;
        int testNarrowingIntVar2 = (int) testNarrowingFloatVar2;
        System.out.println("testNarrowingFloatVar2: " + testNarrowingFloatVar2);
        System.out.println("testNarrowingIntVar2: " + testNarrowingIntVar2);
    }
}