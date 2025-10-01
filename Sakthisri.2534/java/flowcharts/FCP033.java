import java.util.*;
public class FCP033{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int s=0;
int r=0;
int t=n;
while(n!=0){
r=n%10;
s=s*10+r;
n=n/10;
}
if (s==t){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}
