import java.util.*;
public class FCP037{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int i=1;
int c=0;
if(N==0){
System.out.println("No");
return;
}
while(i<N){
if(N%i==0){
c=c+i;
}
i++;
}
if(c==N){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}