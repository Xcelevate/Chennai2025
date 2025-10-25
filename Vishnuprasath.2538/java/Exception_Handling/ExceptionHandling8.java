import java.io.FileReader;
import java.io.IOException;

class ExceptionHandling8{
	public static void main(String[] args) throws IOException{
		System.out.println("Try 8");
		ExceptionHandlingDemo demo = new ExceptionHandlingDemo();
		demo.demoMethod8();
	}
}
class ExceptionHandlingDemo{
	    public void demoMethod8(){
        System.out.println("This is demo method #8.");
        
        try{
            demoMethod6();
        }catch(IOException e){
            System.out.println("An I/O error occurred: " + e.getMessage());
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
		