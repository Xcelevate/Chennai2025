import java.util.*;
public class FCP029{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int R=0;
int A=0;
for(; N>0; N/=10){
R=N%10;
A=A+R;
}
System.out.println(A);
}
}