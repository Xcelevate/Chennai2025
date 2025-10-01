import java.util.*;
public class FCP038{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int s=0;
int r=0;
int t=n;
while(t!=0){
r=t%10;
t=t/10;
s=s+(r*r*r);
}
if(n==s){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
} 


