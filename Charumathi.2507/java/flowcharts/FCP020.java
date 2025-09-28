import java.util.*;
public class FCP020{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int A=Sc.nextInt();
int B=Sc.nextInt();
int C=Sc.nextInt();
int D=Sc.nextInt();
int M1=0;
int M2=0;
if(A<B){
M1=B;
M2=A;
}
else{
M1=A;
M2=B;
}
if(M2>C){
if(M2>D){
System.out.println(M2);
}
else if(M1>D){
System.out.println(D);
}
else{
System.out.println(M1);
}
}
else{
if(M1>C){
M2=C;
}
else{
M2=M1;
M1=C;
}
if(M2>D){
System.out.println(M2);
}
else if(M1>D){
System.out.println(D);
}
else{
System.out.println(M1);
}
}
}
}
