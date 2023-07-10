package main.java.exceptions;

public class InvalidAttributeException extends AttributeException {

    private static final long serialVersionUID = -6486356411454119656L;

    public InvalidAttributeException() {
        super();
    }

    public InvalidAttributeException(String message) {
        super(message);
    }

    public InvalidAttributeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAttributeException(Throwable cause) {
        super(cause);
    }
}
