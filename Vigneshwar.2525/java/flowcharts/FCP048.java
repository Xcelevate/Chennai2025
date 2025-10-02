import java.util.*;
public class FCP048{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
int x=in.nextInt();
int y=in.nextInt();

int c=0;
int t=0;

while(x<=y){

int a=x;
int v=x;
int z=x;

c=0;
while(a!=0){
int b=a%10;
c++;
a=a/10;
}

t=0;
while(v!=0){
int d=v%10;
t=t+(int)Math.pow(d,c);
v=v/10;
}

if(t==z){
System.out.println(z);
}

x++;
}
}
}
