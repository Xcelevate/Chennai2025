import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling18{
	public static void main(String[] args) throws FundsException{
		System.out.println("Try 18");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod18();
	}
}
class ExceptionHandlingDemo{
	 public void demoMethod18() throws FundsException{
        System.out.println("This is demo method #18.");

        int amount =100, balance = 50;

        if (amount > balance) {
            throw new IncorrectAccountDetailsException("Insufficient funds. Available balance: " + balance);
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
class IncorrectAccountDetailsException  extends FundsException {
    public IncorrectAccountDetailsException(String message) {
        super(message);
    }
}


