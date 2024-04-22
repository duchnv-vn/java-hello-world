package section_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExpenseNote {
    static final String TIME_FORMAT = "mm-yyyy";
    static String time;
    static String date;

    public static void main(String[] args) throws IOException {
        BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter month and year (mm-yyyy):");
        time = keyboardReader.readLine();

        System.out.println("Enter date:");
        date = keyboardReader.readLine();

        keyboardReader.close();
    }
}
