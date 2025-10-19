import java.util.*;
public class FCP050{
public static void main(String[]args){
Scanner in=new Scanner(System.in);
int n=in.nextInt();

int t=2;
while(t<=n){
int i=2;
while(i<t){
if(t%i==0){
break;
}
i++;
}
if(n%t==0 && i==t){
System.out.print(t + " ");
}
t++;
}
}
}
