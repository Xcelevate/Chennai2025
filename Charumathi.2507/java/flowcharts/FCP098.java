import java.util.*;
public class FCP098{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
if(N<10){
System.out.println("Yes");
return;
}
int d=0;
int s=0;
int temp=N;
int c=0;
while(temp>0){
d=temp%10;
s=s*10+d;
temp/=10;
c++;
}

int prev=-1;
int i=0;

while(i<c){
d=s%10;
s/=10;
i++;

if(prev!=-1){
if(prev==d%2){
System.out.println("No");
return;
}
}
prev=d%2;
}
System.out.println("Yes");
}
}