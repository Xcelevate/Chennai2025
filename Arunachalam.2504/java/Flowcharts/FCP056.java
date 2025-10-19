import java.util.*;
public class FCP056{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i=0;
while(n>i){
a[i]=s.nextInt();
i++;}
i=0;
int sum1=0,sum2=0;
while(n>i){
if(a[i]%2==0){
sum2=sum2+a[i];
}
else{
sum1=sum1+a[i];}
i++;
}
System.out.println(sum1);
System.out.println(sum2);
}}


