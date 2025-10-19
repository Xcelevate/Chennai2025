import java.util.*;
public class FCP017{
public static void main(String[]args){
Scanner ab=new Scanner(System.in);
int A=ab.nextInt();
int B=ab.nextInt();
int C=ab.nextInt();
int max=0;
int min=0;
if(A>B){
max=A;
min=B;
}else{
max=B;
min=A;
}
if(max>C){
if(min>C){
System.out.println(min);
}
else{
System.out.println(C);
}
}else{
System.out.println(max);
}
}
}