import java.util.*;
public class FCP041{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int B=Sc.nextInt();
int M1=B;
int M2=B;
int M3=B;
for(int i=2; i<=N; i++){
int A=Sc.nextInt();
if(A>M1){
M3=M2;
M2=M1;
M1=A;
}
else if(A>M2){
M3=M2;
M2=A;
}
else if(A>M3){
M3=A;
}
}
System.out.println(M3);
}
}
