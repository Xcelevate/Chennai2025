import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling20{
	public static void main(String[] args) throws AuditException{
		System.out.println("Try 20");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod20();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod20() throws AuditException{
        System.out.println("This is demo method #19.");

        int amount =100, balance = 50;

        if (amount > balance) {
            throw new AuditException("Insufficient funds. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

}

class BankException extends Exception {
    public BankException(String message) {
        super(message);
    }
}

class TransactionException  extends BankException {
    public TransactionException(String message) {
        super(message);
    }
}

class AuditException  extends BankException {
    public AuditException(String message) {
        super(message);
    }
}

