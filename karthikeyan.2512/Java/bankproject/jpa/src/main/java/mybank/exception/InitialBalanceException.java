package mybank.exception;

public class InitialBalanceException extends RuntimeException {
    public InitialBalanceException(String message) {
        super(message);
    }
}
