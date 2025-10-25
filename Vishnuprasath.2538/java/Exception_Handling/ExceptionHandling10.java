import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling10{
	public static void main(String[] args) throws IOException{
		System.out.println("Try 10");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod10();
	}
}
class ExceptionHandlingDemo{
	    public void demoMethod10() throws IOException{
        System.out.println("This is demo method #10.");
        
        try{
            demoMethod6();
        }catch(IOException e){
            System.out.println("An I/O error occurred: " + e.getMessage());
            throw e;
            // You can log the error, prompt the user, or take other recovery actions.            
        }
    }

		
			
		public void demoMethod6() throws IOException{
			System.out.println("this is demo methods 6");
			String fileName1 = "C:\\Users\\vishnu prasath\\OneDrive\\Documents\\7 to 8pm the speaking practice..txt";
			String fileName2 = "C:\\Users\\vishnu prasath\\OneDrive\\Documents\\javac Ganesh.java = complie.txt";

			FileReader reader = new FileReader(fileName1);
			FileReader reader2 = new FileReader(fileName2);           
		}
}
		