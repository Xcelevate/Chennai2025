import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling19{
	public static void main(String[] args) throws TransactionException{
		System.out.println("Try 19");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod19();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod19() throws TransactionException{
        System.out.println("This is demo method #19.");

        int amount =100, balance = 50;

        if (amount > balance) {
            //throw new BankException("Insufficient funds. Available balance: " + balance);
			throw new TransactionException("Insufficient funds. Available balance: " + balance);

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
