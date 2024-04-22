package section_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Section13 {
  public static void main(String[] args) throws IOException {
    // READ SINGLE CHARACTER FROM INPUT DATA
    /*
     * System.out.println("Please enter a value for input1:");
     * int input1 = System.in.read();
     * System.out.println("input1 value: " + input1);
     */

    // BUFFERED READER
    BufferedReader bfReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter a value for input2:");
    String input2 = bfReader.readLine();
    System.out.println("input2 value: " + input2);
  }
}
