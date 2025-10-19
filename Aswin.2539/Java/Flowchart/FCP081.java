import java.util.*;
public class FCP081{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=n;
int l=1;
for(int i=0;i<n;i++){
	for(int j=0;j<m-1;j++){
System.out.print("  ");
}
for(int k=0;k<l;k++){
System.out.print("* ");}
m=m-1;
l=l+1;
System.out.println();}}
}
`