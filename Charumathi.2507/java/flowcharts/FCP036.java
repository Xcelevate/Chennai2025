import java.util.*;
public class FCP036{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
long M=Sc.nextInt();
long N=Sc.nextInt();
long hcf=0;
if(M>N){
long a=M, b=N;
while(b>0){
long temp=b;
b=a%b;
a=temp;
}
hcf=a;
}
else{
long a=N, b=M;
while(b>0){
long temp=b;
b=a%b;
a=temp;
}
hcf=a;
}
long lcm=M*N/hcf;
System.out.println(hcf);
System.out.println(lcm);
}
}