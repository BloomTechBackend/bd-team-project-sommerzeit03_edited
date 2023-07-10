package main.java.exceptions;

public class ContractNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -1962439796381970702L;

    public ContractNotFoundException() {
    }

    public ContractNotFoundException(String message) {
        super(message);
    }

    public ContractNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ContractNotFoundException(Throwable cause) {
        super(cause);
    }
}
