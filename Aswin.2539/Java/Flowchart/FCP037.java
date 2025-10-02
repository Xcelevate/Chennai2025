import java.util.*;
public class FCP037{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
long sum=0;
for(int i=1;i*i<=n;i++){
if(n%i==0){
sum+=i;}
}
if(sum==n){
System.out.println("Yes");}
else{
System.out.println("No");}
}
}