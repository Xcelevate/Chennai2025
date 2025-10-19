import java.util.*;
public class FCP051{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int d=0;
int A=0;
while(N>=10){
int s=0;
for(int i=N; i>0; i/=10){
d=i%10;
s=s+d;
A=s;
}
N=s;
}
System.out.println(A);
}
}