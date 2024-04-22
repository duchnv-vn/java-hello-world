package section_13;

import java.io.*;
import java.util.*;

public class Section13 {
  public static void main(String[] args) throws IOException, FileNotFoundException {
    // READ SINGLE CHARACTER FROM INPUT DATA
    /*
     * System.out.println("Please enter a value for input1:");
     * int input1 = System.in.read();
     * System.out.println("input1 value: " + input1);
     */

    // BUFFERED READER
    /*
     * BufferedReader bfReader = new BufferedReader(new
     * InputStreamReader(System.in));
     * System.out.println("Please enter a value for input2:");
     * String input2 = bfReader.readLine();
     * System.out.println("input2 value: " + input2);
     * bfReader.close();
     */

    // FILE READER
    String filePath = "D:/17.java/1.projects/java-hello-world/src/section_13/example.csv";
    /*
     *
     * BufferedReader fileReader = new BufferedReader(new FileReader(filePath));
     * String line;
     * while ((line = fileReader.readLine()) != null) {
     * System.out.println("fileData value: " + line);
     * }
     * fileReader.close();
     */

    // SCANNER
    /*
     * Scanner keyboardScanner = new Scanner(System.in);
     * System.out.println("Enter your name:");
     * String name = keyboardScanner.nextLine();
     * System.out.println("Enter your age:");
     * int age = keyboardScanner.nextInt();
     *
     * System.out.println("user: " + name + "-" + age);
     * keyboardScanner.close();
     */

    File file = new File(filePath);
    Scanner fileScanner = new Scanner(file);
    while (fileScanner.hasNextLine()) {
      System.out.println("fileData value: " + fileScanner.nextLine());
    }
    fileScanner.close();
  }
}
