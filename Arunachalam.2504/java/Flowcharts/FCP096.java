import java.util.*;
public class FCP096 {
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int temp=0;
int min=0;
int aa=-1;
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<n-1;i++){
aa=i;
for(int j=i;j<n;j++){
if(a[aa]>a[j]){
aa=j;}
}
temp=a[aa];
a[aa]=a[i];
a[i]=temp;}
for(int x:a){
System.out.println(x);}}}
     