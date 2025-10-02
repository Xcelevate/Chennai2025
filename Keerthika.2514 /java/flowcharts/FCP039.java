import java .util.*;
public class FCP039{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a=sc.nextInt();
int max=a;
int min=a;
for(int i=2;i<=n;i++){
	int b=sc.nextInt();
	if(b>max){
		max=b;
	}
	if(min>b){
		min=b;
	}
}
System.out.println(max);
System.out.println(min);
}}