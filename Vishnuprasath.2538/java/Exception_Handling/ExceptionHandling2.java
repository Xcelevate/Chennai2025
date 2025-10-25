import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling2{
	public static void main(String[] args){
		System.out.println("Try 2");
	
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod2();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod2(){
		System.out.println("this is demo 2");
		int num1 = 10, num2 = 0;
		int num3 = num1/num2;
		System.out.println("the result is:" +num3);
	}
}
