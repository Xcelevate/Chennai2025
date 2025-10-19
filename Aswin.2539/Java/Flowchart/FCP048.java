import java.util.*;
public class FCP048{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
long n = scan.nextLong();
long m=scan.nextLong();
for(int i=m;i<=n;i++){
int sum=0;
	for(int t=i;t>0;t/=10){
int d=t%10;
int a=d*d*d*d;
sum=sum+a;
}
if(sum==i){
System.out.println(sum);
}
}
}
}