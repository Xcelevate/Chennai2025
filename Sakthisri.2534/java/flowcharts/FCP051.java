import java.util.*;
public class FCP051{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int q=0;
int r=0;
while(n>=10){
int s=0;
while(n!=0){
r=n%10;
s=s+r;
n=n/10;
}
n=s;
}
System.out.println(n);
}
}
