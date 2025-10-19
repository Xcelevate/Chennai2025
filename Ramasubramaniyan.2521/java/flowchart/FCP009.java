import java.util.Scanner;
public class FCP009{
public static void main(String[]args)
{
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	
	int c=a-a%b;
System.out.println(c);
}
}