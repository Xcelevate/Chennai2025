import java.util.*;
public class cz{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
int d=0,t=0,d1=0;
int ans=0;
for(int i=1;i<=n;i++){
int j=i;
int k=i;
c=0;
t=0;
while(j>0){
d=j%10;
c=c+1;
j=j/10;
}
while(k>0){
d1=k%10;
if(d1%2==0){
t=t+1;
}
k=k/10;
}
if(c==t){
ans=ans+1;
}
}
System.out.println(ans);
}} 
