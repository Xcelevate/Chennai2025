import java.util.*;
public class FCP025 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		if(n<1){
			return;
		}
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				c+=i;
			}
		}
		System.out.println(c);
	}
}