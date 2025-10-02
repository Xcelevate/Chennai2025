import java.util.*;
public class FCP080{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int a[]=new int[n];
int b[]=new int[m];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=0;i<m;i++){
b[i]=s.nextInt();
}
int result[]=new int[n+m]; 
for(int i=n-1;i>=0;i--){
for(int j=m-1;j>=0;j--){
int mul=a[i]*b[j];
int pos1=i+j;
int pos2=i+j+1;
int sum=mul+result[pos2];
result[pos2]=sum%10;
result[pos1]+=sum/10;
}} 
int i=0;
while(i<result.length&&result[i]==0){
i++;
}
if(i==result.length){
System.out.println(0);
}
else{
for(;i<result.length;i++){
System.out.println(result[i]);
}}}}
