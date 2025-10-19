import java.util.*;
public class Fcp049{
	public static void main(String[]args){
		Scanner kk=new Scanner(System.in);
		int n=kk.nextInt();
		int c,z=0;
		int i=2;
		while(i<n){
			c=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					c +=1;
				}
			}
			if(c==2){
				z +=1;
			}
			i++;
		}
		System.out.println(z);
	}
}