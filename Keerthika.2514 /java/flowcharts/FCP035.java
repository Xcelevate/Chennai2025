import java.util.*;
public class FCP035{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=1;
int c=0;
for(i=1;i<=n;i++){
if(n%i==0){
	c=c+1;
}
}
if(c==2){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}}
