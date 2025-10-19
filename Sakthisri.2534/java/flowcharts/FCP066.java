import java.util.*;
public class  FCP066{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int m=input.nextInt();
int n=input.nextInt();
int[] a=new int[m];
int[] b=new int[n];
int in[]=new int[n+m];
int[] c=new int[n+m];
int i=0;
for(i=0;i<m;i++){
 a[i]=input.nextInt();
}

for(i=0;i<n;i++){
 b[i]=input.nextInt();
}

int k=0;
for( i=0;i<m;i++){
 for(int v=0;v<n;v++){
  if(a[i]==b[v]){
  in[k]=a[i];
  k++;
  break;
}
}
}
int h=m+n;
int f=0;
for( i=0;i<h;i++){
if(i<m){
 c[i]=a[i];
}
else{
c[i]=b[f];
f++;
}
}
int p = h-k;
Arrays.sort(c);
int t=-1;
for( i=0;i<h;i++){
if(c[i]!=t){
System.out.println(c[i]);
t=c[i];
}
}

for(i=0;i<k-1;i++){
for(int j=i+1;j<k;j++){
if(in[i]>in[j]){
int temp=in[i];
in[i]=in[j];
in[j]=temp;
}
}
}
t=-1;
for(i=0;i<k;i++){
if(in[i]!=t){
System.out.println(in[i]);
t=in[i];
}
}
}
}