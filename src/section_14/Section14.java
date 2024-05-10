package section_14;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

import section_14.customUncheckedException.InvalidIndexException;

public class Section14 {

    private static Logger logger = Logger.getLogger(Section14.class.getName());

    public static void main(String[] args) {
        String[] customArray = { "one", "two", "three", null };

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter numberical index value");
            int index = scanner.nextInt();

            if (index < 0 | index > customArray.length) {
                throw new InvalidIndexException("Index must greater/equal zero and smaller than array length");
            }

            String value = customArray[index];
            logger.info("Value of index " + index + " = " + value.toUpperCase());
        } catch (NullPointerException e) {
            logger.severe("This is null pointer exception");
        } catch (InputMismatchException e) {
            logger.severe("This is miss match exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.severe("This is array index out of bound exception");
        } catch (Exception e) {
            logger.severe("This is general exception: " + e.getMessage());
        } finally {
            // NO NEED TO CLOSE CONNECTION
            // scanner.close();
        }
    }
}
