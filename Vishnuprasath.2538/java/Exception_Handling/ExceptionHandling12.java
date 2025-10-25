import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling12{
	public static void main(String[] args) throws IOException{
		System.out.println("Try 12");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod12();
	}
}
class ExceptionHandlingDemo{
	 public void demoMethod12(){
        System.out.println("This is demo method #12.");
        
        try{
            demoMethod2();
            System.out.println("Method2 invoked successfully. This shouldn't happen.");
        }catch(ArithmeticException  ae){
            System.out.println("An arithmetic error occurred: " + ae.getMessage());
            // You can log the error, prompt the user, or take other recovery actions.
            ae.printStackTrace();
        }finally{
            System.out.println("Clean up after method2 invocation.");
        }
    }


		
			
	
	public void demoMethod2(){
		System.out.println("this is demo 2");
		int num1 = 10, num2 = 0;
		int num3 = num1/num2;
		System.out.println("the result is:" +num3);
	}
}
