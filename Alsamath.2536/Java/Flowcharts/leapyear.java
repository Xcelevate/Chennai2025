import java.util.*;
public class leapyear{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0){
			return;
		}
		if((n%400==0)||((n%4==0)&&(n%100!=0))){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}