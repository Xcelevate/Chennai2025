import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling7{
	public static void main(String[] args) throws IOException{
		System.out.println("Try 7");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod7();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod7() throws IOException{
			System.out.println("This is demo method #7.");
			demoMethod6();
	}
	public void demoMethod6() throws IOException{
		System.out.println("this is demo methods 6");
		String fileName1 = "C:\\Users\\vishnu prasath\\OneDrive\\Documents\\7 to 8pm the speaking practice..txt";
		String fileName2 = "C:\\Users\\vishnu prasath\\OneDrive\\Documents\\javac Ganesh.java = complie.txt";

		FileReader reader = new FileReader(fileName1);
		FileReader reader2 = new FileReader(fileName2);
	}
}
	
																
