package section_14.customUncheckedException;

public class InvalidIndexException extends ArrayIndexOutOfBoundsException {
    public InvalidIndexException() {
        super();
    }

    public InvalidIndexException(String message) {
        super(message);
    }
}
