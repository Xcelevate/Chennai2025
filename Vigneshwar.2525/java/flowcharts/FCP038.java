import java.util.*;
public class FCP038{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a = 0;
int z = n;
int x = n;
int c = 0;
int t = 0;

while(z!=0){
a = z%10;
c = c+1;
z = z/10;
}
while(x!=0){
a = x%10;
int b = a*a*a;
t = t+b;
x=x/10;
}
if(t==n){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}
