import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling11{
	public static void main(String[] args) throws IOException{
		System.out.println("Try 11");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod11();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod11(){
        System.out.println("This is demo method #11.");
        
        try{
            demoMethod1();
            System.out.println("Method1 invoked successfully.");
        }catch(ArithmeticException  ae){
            System.out.println("An I/O error occurred: " + ae.getMessage());
            // You can log the error, prompt the user, or take other recovery actions.
        }finally{
            System.out.println("Clean up after method1 invocation.");
        }
    }

		
			
	public void demoMethod1(){
		System.out.println("this is demo");
		int num1 = 10, num2 = 2;
		int num3 = num1/num2;
		System.out.println("the result is:" +num3);
	}
}
		