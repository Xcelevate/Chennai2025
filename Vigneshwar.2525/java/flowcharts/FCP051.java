import java.util.*;
public class FCP051{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();

int t=0;

while(n!=0){
t=0;
while(n!=0){

int a=n%10;
n=n/10;
t=t+a;
}

if(t<10 && t>=0){
System.out.println(t);
break;
}
else{
n=t;
}

}

}
}
