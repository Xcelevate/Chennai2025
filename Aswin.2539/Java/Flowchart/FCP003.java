import java.util.*;
public class FCP003{
	public static void main(String [] args){
	Scanner scan= new Scanner(System.in);
	int a=scan.nextInt();
	int b=scan.nextInt();
	int c;
	 c=b;
	 b=a;
	 a=c;
	System.out.println(a);
	System.out.println(b);
}
}