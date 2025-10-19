import java.util.*;
public class FCP063{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int i=0,h=0,c=0;
while(n>i){
if(a[i]==1)
{
c=c+1;
}
else{
if(a[i]==0){
c=0;}}
if(h<c){
h=c;}
i++;}
System.out.println(h);}}
