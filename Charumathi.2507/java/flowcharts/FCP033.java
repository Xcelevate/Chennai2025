import java.util.*;
public class FCP033{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int R=0;
int A=0;
int P=N;
for(; N>0; N/=10){ 
A=N%10;
R=R*10+A;
}
if(P==R){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}
