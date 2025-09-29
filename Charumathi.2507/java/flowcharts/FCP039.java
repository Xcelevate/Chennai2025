import java.util.*;
public class FCP039{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int A=Sc.nextInt();
int Max=A;
int Min=A;
int i=1;
while(i<N){
int B=Sc.nextInt();
if(B>Max){
Max=B;
}
if(B<Min){
Min=B;
}
i++;
}
System.out.println(Max);
System.out.println(Min);
}
}