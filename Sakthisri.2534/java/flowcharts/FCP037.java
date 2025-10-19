import java.util.*;
public class FCP037{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
if(n<=1){
 System.out.println("No");
 return;
}
int i=1;
int r=0;
int s=0;
while(i<n){
r=n%i;
if(r==0){
s=s+i;
}
i++;
}
if(s==n){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}

