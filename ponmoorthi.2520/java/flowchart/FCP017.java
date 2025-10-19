import java.util.*;
public class FCP017{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int max=0;
int min=0;
if(a>b){
max=a;
min=b;
}else{
max=b;
min=a;
}
if(max>c){
	if(min>c){
		System.out.println(min);
	}else{
		System.out.println(c);
	}
}else{
	System.out.println(max);
}
}}