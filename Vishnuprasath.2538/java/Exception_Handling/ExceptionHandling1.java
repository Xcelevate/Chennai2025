import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling1{
	public static void main(String[] args){
		System.out.println("Try");
	
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod1();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod1(){
		System.out.println("this is demo");
		int num1 = 10, num2 = 2;
		int num3 = num1/num2;
		System.out.println("the result is:" +num3);
	}
}
