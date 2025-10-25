import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling14{
	public static void main(String[] args) throws IOException{
		System.out.println("Try 14");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod14();
	}
}
class ExceptionHandlingDemo{
	 public void demoMethod14(){
        System.out.println("This is demo method #14.");
        
        try{
            demoMethod2();
            System.out.println("Method2 invoked successfully. This shouldn't happen.");
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