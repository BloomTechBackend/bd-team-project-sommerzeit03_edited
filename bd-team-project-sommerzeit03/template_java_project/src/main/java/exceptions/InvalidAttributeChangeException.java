package main.java.exceptions;

public class InvalidAttributeChangeException extends AttributeException {

    private static final long serialVersionUID = -3410607452045732946L;

    public InvalidAttributeChangeException() {
        super();
    }

    public InvalidAttributeChangeException(String message) {
        super(message);
    }

    public InvalidAttributeChangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAttributeChangeException(Throwable cause) {
        super(cause);
    }
}
