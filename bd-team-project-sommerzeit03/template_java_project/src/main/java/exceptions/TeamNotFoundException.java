package main.java.exceptions;

public class TeamNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 4263601002486266301L;

    public TeamNotFoundException() {
    }

    public TeamNotFoundException(String message) {
        super(message);
    }

    public TeamNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamNotFoundException(Throwable cause) {
        super(cause);
    }
}
