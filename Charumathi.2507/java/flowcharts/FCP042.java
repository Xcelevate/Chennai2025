import java.util.*;
public class FCP042{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
long a=0;
long b=1;
for(int i=1; i<=N; i++){
System.out.println(a);
long temp=a;
a=b;
b=temp;
a=a+b;
}
}
}