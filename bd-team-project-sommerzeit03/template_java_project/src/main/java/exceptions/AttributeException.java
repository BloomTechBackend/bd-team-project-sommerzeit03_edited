package main.java.exceptions;

public class AttributeException extends RuntimeException {

    private static final long serialVersionUID = -8060403016884972716L;

    public AttributeException() {
        super();
    }

    public AttributeException(String message) {
        super(message);
    }

    public AttributeException(String message, Throwable cause) {
        super(message, cause);
    }

    public AttributeException(Throwable cause) {
        super(cause);
    }
}
