import java.util.Scanner;
public class FCP029{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0;
if(n==0){
sum=0;
}
else{
while(n>0){
	int l=n%10;
	sum+=l;
	n/=10;
}
}
System.out.println(sum);
}
}

