import java.util.*;
public class FCP042{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
long a=0;
long b=1;
for(int i=1;i<=n;i++){
System.out.println(a);
long c=a+b;
a=b;
b=c;}
}
}