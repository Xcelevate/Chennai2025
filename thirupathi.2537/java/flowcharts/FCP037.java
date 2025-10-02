import java.util.Scanner;
public class FCP037 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
if(n<=1) {
System.out.println("No");
return;
}
for(int i=1; i<n; i++){
if(n%i==0) {
sum += i;
}
}
if(sum == n) {
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}