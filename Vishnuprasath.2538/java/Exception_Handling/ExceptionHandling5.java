import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling5{
	public static void main(String[] args){
		System.out.println("Try 5");
	
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod5();
	}
}
class ExceptionHandlingDemo{
	public void demoMethod5(){
		String fileName1 = "C:\\Users\\vishnu prasath\\OneDrive\\Documents\\7 to 8pm the speaking practice..txt";
		String fileName2 = "C:\\Users\\vishnu prasath\\OneDrive\\Documents\\javac Ganesh.java = complie.txt";
		try{
			FileReader reader = new FileReader(fileName1);
			FileReader reader2 = new FileReader(fileName2);
		}
		catch(IOException e) {
			System.out.println("An I/O error occured: "+e.getMessage());
		}
	}
}
		