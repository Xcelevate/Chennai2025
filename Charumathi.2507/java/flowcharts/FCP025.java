import java.util.*;
public class FCP025{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int s=0;
int i=1;
while(i<=N){
s=s+i;
i=i+2;
}
System.out.println(s);
}
}