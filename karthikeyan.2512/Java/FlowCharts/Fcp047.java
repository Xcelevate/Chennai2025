import java.util.*;
public class Fcp047{
	public static void main(String[]args){
		Scanner kk=new Scanner(System.in);
		int n=kk.nextInt();
		int x=kk.nextInt();
		int i=2;
		int max =x,min,r,c=1;;
		while(i<=n){
			min=kk.nextInt();
			if(min==0){
				c=0;
				}
			    while(min>0){
				   r=max%min;
				   max=min;
				   min =r;
			    }
			i++;
		}
		if(c==0){System.out.println(c);}
		else{System.out.println(max);}
	}
}