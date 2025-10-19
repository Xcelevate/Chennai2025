import java.util.*;
public class FCP015{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int A=Sc.nextInt();
int B=Sc.nextInt(); 
int C=Sc.nextInt();
int D=Sc.nextInt();
int Max1;
int Max2;
if(A>B){
Max1 = A;
}
else{
Max1 = B;
}
if(C>D){
Max2 = C;
}
else{
Max2 = D;
}
if(Max1>Max2){
System.out.print(Max1);
}
else{
System.out.print(Max2);
}
}
}


