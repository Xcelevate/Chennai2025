import java.util.*;
public class FCP083{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int c=2;
for(int i=0;i<n;i++){
	for(int j=0;j<=i;j++){
System.out.print(c+" ");
}
c=c*2;
System.out.println();}
}
}