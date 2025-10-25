import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling3{
	public static void main(String[] args){
		System.out.println("Try 3");
	
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod3();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod3(){
		System.out.println("this is demo 3");
		int num1 = 10, num2 = 0;
		try{
			int num3 = num1/num2;
			System.out.println("the result is:" +num3);
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero is not feasible.");
		}
	}
}
