package section_14.customCheckedException;

import java.util.InputMismatchException;

public class InvalidValueException extends InputMismatchException {
    public InvalidValueException() {
        super();
    }

    public InvalidValueException(String message) {
        super(message);
    }
}
