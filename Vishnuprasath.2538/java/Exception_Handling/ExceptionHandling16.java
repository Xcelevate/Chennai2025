import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling16{
	public static void main(String[] args) throws InsufficientFundsException{
		System.out.println("Try 16");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod16();
	}
}
class ExceptionHandlingDemo{
	 public void demoMethod16() throws InsufficientFundsException{
        System.out.println("This is demo method #16.");
        
        int amount =100, balance = 50;
        
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }
}


class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}  
