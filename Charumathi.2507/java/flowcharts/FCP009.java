import java.util.*;
public class FCP009{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int A=Sc.nextInt();
int B=Sc.nextInt(); 
int N;
int R;
if (A%B != 0){
N = A/B;
R = N*B;
System.out.println(R);
}
else{
A = A-1;
N = A/B;
R = N*B;
System.out.println(R);
}
}
}