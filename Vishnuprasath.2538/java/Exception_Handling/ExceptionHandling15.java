import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling15{
	public static void main(String[] args) throws IOException{
		System.out.println("Try 15");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod15();
	}
}
class ExceptionHandlingDemo{
	 public void demoMethod15(){
        System.out.println("This is demo method #15.");
        
        try {
                int[] numbers = {1, 2, 3};
                // This line can throw an ArrayIndexOutOfBoundsException

            System.out.println(numbers[4]); 

            // This line can throw an ArithmeticException
            int result = 10 / 0; 
            System.out.println(result);

        } catch (RuntimeException e) {
            System.out.println("Caught an RuntimeException: " + e.getMessage());
		}catch (Exception e) { // Generic catch block for any other exceptions
            System.out.println("Caught a generic Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
        System.out.println("Program continues after exception handling.");
    }
}