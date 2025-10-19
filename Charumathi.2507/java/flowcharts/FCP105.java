import java.util.*;
public class FCP105{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int temp=n;
int X=0;
int s=0;
if(n<=0){
System.out.println("No");
}
else{
while(n>0){
X=n%10;
n=n/10;
int M=1;
while(X>1){
M=M*X;
X--;
}
s=s+M;
}
if(s==temp){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}
}