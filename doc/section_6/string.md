# STRING IN JAVA
## Declare methods:
1. Literal method
    - Syntax: `String str = "Content here"`
    - Store string object into String pool of Heap memory
    - Check for existing object with same value in String pool before create new object:
        - If exist: Reference to the existing object (no create new one)
        - If no exist: Create new object & store into String pool
2. `new` operator method
    - Syntax: `String str = new String("Content here")`
    - Alway create new string object in Heap memory

## Compare string variable values:
1. Using `==` operator:
    - Syntax:
        ```
        String str1 = "string 1";
        String str2 = "string 2";
        boolean compare = str1 == str2;
        ```
    - Both variables must be reference to object in string pool
2. Using `equals` / `equalsIgnoreCase` operation:
    - Syntax:
        ```
        String str1 = "string 1";
        String str2 = "string 2";
        boolean compare = str1.equals(str2);
        ```
    - Return boolean value
3. Using `compareTo` / `compareToIgnoreCase` operation:
    - Syntax:
        ```
        String str1 = "string 1";
        String str2 = "string 2";
        boolean compare = str1.compareTo(str2);
        ```
    - Return integer value:
        - == 0: equal
        - != 0: no equal (value is subtract of str1 and str2 different character hascode)

## Check is empty:
1. `isEmpty()`:
    - Syntax:
        ```
        boolean isEmpty = "".isEmpty();
        ```
2. `length()`:
    - Syntax:
        ```
        boolean isEmpty = "".length() == 0;
        ```
3. `equals()`:
    - Can handle case null value
    - Syntax:
        ```
        boolean isEmpty = "".equals("");
        ```
4. `isBlank()`:
    - Can handle case exist space character
    - Syntax:
        ```
        boolean isEmpty = "    ".isBlank();
        ```

## Search value in string:
1. `indexOf()`:
    - Return start index of value in string
    - If no exist: return -1
    - Syntax:
        ```
        String text = "Hello, World!";
        int index = text.indexOf("World");
        boolean isExist = index != -1;
        ```
2. `contains()`:
    - Return boolean value
    - Syntax:
        ```
        String text = "Hello, World!";
        boolean isExist = text.contains("World");
        ```
3. `startsWith()` / `endsWith()`:
    - Return boolean value
    - Syntax:
        ```
        String text = "Hello, World!";
        boolean isStartWith = text.startsWith("Hello");
        boolean isEndWith = text.endsWith("!");
        ```
4. `matches()`:
    - Using for complex matching pattern by regex
    - Return boolean value
    - Syntax:
        ```
        String text = "Hello, World!";
        boolean isExist = text.matches(".*World.*");
        ```

## Replace value in string
1. `replace()`:
    - Replace a character or a sequence of characters
    - Syntax:
        ```
        String currentString = "Hello, World!";
        String newString1 = currentString.replace('o', '*');
        String newString2 = currentString.replace("World", "Earth");
        ```
2. `replaceAll()`:
    - Replace different characters to a new one by regex
    - Syntax:
        ```
        String currentString = "Hello, World!";
        String newString = currentString.replaceAll("u|e|o|a|i", "*");
        ```
3. `replaceFirst()`:
    - Replace only first matched result
    - Syntax:
        ```
        String currentString = "Hello, World!";
        String newString = currentString.replaceFirst("o", "*");
        ```

## Mutable string
1. StringBuilder:
    - Syntax:
        ```
        StringBuilder sb = new StringBuilder("hello");
        sb.append(" world");
        String text = sb.toString();
        ```
2. StringBuffer:
    - Thread-safe
    - Syntax:
        ```
        StringBuffer sb = new StringBuffer("hello");
        sb.append(" world");
        String text = sb.toString();
        ```
3. CharArrayWrite:
    - Syntax:
        ```
        CharArrayWriter cw = new CharArrayWriter();
        cw.write("hello");
        cw.write(" world");
        String text = cw.toString();
        ```

## Text block
- Syntax:
    ```
    String textBlock = """
        <html>
            <body>
                <h1>Hello world.</h1>
            </body>
        </html>
    """;
    ```

## Convert string to primitive type
- Integer:
    ```
    String strInteger = "123";
    int parsedInteger = Integer.parseInt(strInteger);
    ```
- Double:
    ```
    String strDouble = "3.14";
    double parsedDouble = Double.parseDouble(strDouble);
    ```
- Float:
    ```
    String strFloat = "1.23";
    float parsedFloat = Float.parseFloat(strFloat);
    ```
- Long:
    ```
    String strLong = "123123123123123";
    long parsedLong = Long.parseLong(strLong);
    ```
- Boolean:
    ```
    String strBoolean = "true";
    boolean parsedBoolean = Boolean.parseBoolean(strBoolean);
    ```
- Char:
    ```
    String str = "Hello";
    char charFromStr = str.charAt(0);
    ```