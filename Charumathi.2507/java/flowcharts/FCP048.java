import java.util.*;
public class FCP048{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int M=Sc.nextInt();
int N=Sc.nextInt();
for(int i=M; i<=N; i++){
int c=0;
int temp=i;
int s=0;
while(temp>0){
temp/=10;
c++;
}
temp=i;
while(temp>0){
int d=temp%10;
temp/=10;
s+=Math.pow(d, c);
}
if(s==i){
System.out.println(i);
}
}
}
}