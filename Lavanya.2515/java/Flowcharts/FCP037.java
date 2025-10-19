import java.util.*;
public class FCP037{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
if(N<=1){
 System.out.println("No");
return;}

int c=0;
for(int i=1;i<=N/2;i++){
if(N%i==0){
 c=c+i;}
}
if(N==c){
System.out.println("Yes");}
else{
System.out.println("No");}
}}


