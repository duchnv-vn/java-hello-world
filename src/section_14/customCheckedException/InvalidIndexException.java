package section_14.customCheckedException;

public class InvalidIndexException extends Exception {
    public InvalidIndexException() {
        super();
    }

    public InvalidIndexException(String message) {
        super(message);
    }
}
