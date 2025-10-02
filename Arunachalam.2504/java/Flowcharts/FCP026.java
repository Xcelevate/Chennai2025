import java.util.*;
public class FCP026{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
long M=s.nextInt();
long N=s.nextInt();
long sum=0;
for(long i=M;i<=N;i++){
sum=sum+i;
}
System.out.println(sum);
}}
