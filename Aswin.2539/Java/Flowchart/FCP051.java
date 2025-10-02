import java.util.*;
public class FCP051{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
long n = scan.nextLong();
while(n>=10){
long sum=0;
while(n>0){
int r=(int)n%10;
n=n/10;
sum+=r;
}
n=sum;
}
System.out.println(n);
}
}