import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling4{
	public static void main(String[] args){
		System.out.println("Try 4");
	
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod4();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod4(){
		String fileName1 = "C:\\Users\\vishnu prasath\\OneDrive\\Documents\\7 to 8pm the speaking practice..txt";
		String fileName2 = "C:\\Users\\vishnu prasath\\OneDrive\\Documents\\javac Ganesh.java = complie.txt";
		
		FileReader reader = new FileReader(fileName1);
        FileReader reader2 = new FileReader(fileName2);
	}
}
		