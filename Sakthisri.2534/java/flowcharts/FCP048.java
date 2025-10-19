import java.util.*;
public class FCP048{
public static void main(String[] args){
Scanner input =new Scanner(System.in);
int n=input.nextInt();
int m=input.nextInt();
for(int i=n;i<=m;i++){
int t=i;
int j=i;
int s=0;
int c=0;
int d=0;
while(j!=0){
j=j/10;
c=c+1;
}
j=i;
while(j!=0){
d=j%10;
s=s+(int)Math.pow(d,c);
j=j/10;
}
if(t==s){
System.out.println(s);
}
}
}
}

