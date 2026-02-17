package exception;

public class MAin {
    public static void main(String[] args) {
        try {
            throw new InitialBalanceException();
        }
        catch (InitialBalanceException e) {
            Runnable runnable = () -> System.out.println(e);
            runnable.run();
        }
    }
}
