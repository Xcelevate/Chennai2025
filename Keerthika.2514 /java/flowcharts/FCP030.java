import java.util.*;
public class FCP030{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int i=1;
int a=0;
for(i=1;i*i<=number;i++){
	a=i*i;
}
if(number==a){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}}