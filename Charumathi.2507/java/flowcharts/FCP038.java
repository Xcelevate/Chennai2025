import java.util.*;
public class FCP038{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int temp=N;
int A=0;
int R=0;
for(; N>0; N/=10){ 
A=N%10;
R=(int)Math.pow(A, 3)+R;
}
if(R==temp){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}

