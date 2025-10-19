import java.util.Scanner;
public class FCP058{
public static void main(String []args){
 Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n+1];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}
int m=s.nextInt();
int x=s.nextInt();
for(int i=n;i>m-1;i--){
a[i]=a[i-1];
}
a[m-1]=x;	
	
	

for(int i=0;i<=n;i++){
	System.out.println(a[i]);
}
}
}
