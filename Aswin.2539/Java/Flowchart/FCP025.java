import java.util.*;
public class FCP025{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=1;
int sum=0;
for(i=1;i<=n;i+=2){
sum+=i;}
System.out.println(sum);
}
}