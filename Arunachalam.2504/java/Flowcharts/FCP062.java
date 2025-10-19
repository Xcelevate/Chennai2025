import java.util.*;
public class FCP062{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int k=s.nextInt();
int i=0;
while(k>i){
int j=0;
int temp=a[j];
int g=0;
while((n-1)>g){
a[g]=a[g+1];
g++;}
a[g]=temp;
i++;}
i=0;
while(i<n){
System.out.println(a[i]);
i++;}}}



