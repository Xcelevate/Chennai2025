import java.util.*;
public class FCP026{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		long c=0;
		if(start > end){
			return;
		}
		for (int i=start;i<=end;i++){
			c+=i;
		}
		System.out.println(c);
	}
}