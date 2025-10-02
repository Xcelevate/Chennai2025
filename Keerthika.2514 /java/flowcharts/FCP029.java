import java.util.*;
public class FCP029{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int a=0;
int c=0;
if(N==0){
c=0;
}else{
while(N>0){
 a=N%10;
 N=N/10;
 c=c+a;
}
}
System.out.println(c);
}}