package main.java.exceptions;

public class PlayerNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 3405250921097191494L;

    public PlayerNotFoundException() {
    }

    public PlayerNotFoundException(String message) {
        super(message);
    }

    public PlayerNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerNotFoundException(Throwable cause) {
        super(cause);
    }
}
