import java.util.*;
public class FCP027{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
double s=0;
for(int i=1; i<=N; i++){
double d= (double)1/i;
s+=d;
}
System.out.println(s);
}
}