import java.util.*;
public class FCP069{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();}
int k=s.nextInt();
int m=n;
int p=0;
while(m>0){
p=(p+k-1)%m;
System.out.println(a[p]);
for(int j=p;j<m-1;j++){
a[j]=a[j + 1];}
m--;}}}
