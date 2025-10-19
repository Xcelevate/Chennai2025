import java.util.*;
public class FCP020{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=sc.nextInt();
int max=0;
int min=0;
int max1=0;
int min1=0;
if(a>b){
max=a;
min=b;
}else{
max=b;
min=a;
}
if(c>d){
max1=c;
min1=d;
}else{
max1=d;
min1=c;
}
if(max>max1){
	if(max1>min){
		System.out.println(max1);
	}else{
		System.out.println(min);
	}
}
else{
	if(max>min1){
		System.out.println(max);
	}else{
		System.out.println(min1);
	}
}
}}