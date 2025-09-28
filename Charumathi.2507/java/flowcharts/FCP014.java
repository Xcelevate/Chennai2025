import java.util.*;
public class FCP014{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int A=Sc.nextInt();
int B=Sc.nextInt(); 
int C=Sc.nextInt();
if(A>B){
if(A>C){
System.out.println(A);
}
else{
System.out.println(C);
}
}
else if(B>C){
System.out.println(B);
}
else{
System.out.println(C);
}
}
}


