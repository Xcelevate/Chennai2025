import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling13{
	public static void main(String[] args) throws IOException{
		System.out.println("Try 13");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod13();
	}
}
class ExceptionHandlingDemo{
	 public void demoMethod13(){
        System.out.println("This is demo method #13.");
        
        try{
            demoMethod1();
            System.out.println("Method1 invoked successfully.");
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