import java.util.*;
public class FCP065{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int a[]=new int[m];
int b[]=new int[n];
for(int i=0;i<m;i++){
a[i]=s.nextInt();
}
for(int i=0;i<n;i++){
b[i]=s.nextInt();
}
int c[]=new int[m+n];
int i=0,j=0,k=0;
while(i<m&&j<n){
if(a[i]<=b[j]){
c[k++]=a[i++];
}else{
c[k++]=b[j++];
}
}
while(i<m){
c[k++]=a[i++];
}
while(j<n){
c[k++]=b[j++];
}
int size=m+n;
double median;
if(size%2==1){
median=c[size/2];
}else{
median=(c[size/2-1]+c[size/2])/2.0;
}
System.out.println(median);
}
}
