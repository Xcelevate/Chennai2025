import java.util.*;
public class FCP058{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n+1];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int i=n;
int m=s.nextInt();
int x=s.nextInt();
m=m-1;
while(i>m){
a[i]=a[i-1];
i--;}
a[m]=x;
i=0;
while(i<=n){
System.out.println(a[i]);
i++;}}}