import java.util.*;
public class Fcp056{
	public static void main(String[]args){
		Scanner kk=new Scanner(System.in);
		int n=kk.nextInt();
		int []arr=new int [n];
		int sumod=0,sumev=0,a;
		for(int i=0;i<n;i++){
			a=kk.nextInt();
			if(a%2==0){
				sumev +=a;
			}
			else{
				sumod +=a;
			}
			arr[i]=a;
		}
		System.out.println(sumod);
		System.out.println(sumev);
	}
}