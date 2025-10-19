import java.util.*;
public class FCP037{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a = 0;

for(int i=1;i<=n/2;i++){
if(n%i==0){
a += i;
}
}

if(a==n && n>1){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}
