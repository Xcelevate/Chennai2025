import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling17{
	public static void main(String[] args) throws FundsException{
		System.out.println("Try 17");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod17();
	}
}
class ExceptionHandlingDemo{
	 public void demoMethod17() throws FundsException{
        System.out.println("This is demo method #17.");

        int amount =100, balance = 50;

        if (amount > balance) {
            throw new FundsException("Insufficient funds. Available balance: " + balance);
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

class FundsException  extends TransactionException {
    public FundsException(String message) {
        super(message);
    }
} 

