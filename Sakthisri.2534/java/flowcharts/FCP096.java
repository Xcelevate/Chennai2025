import java.util.*;
public class FCP096 {
public static void main(String[] args){
Scanner input=new Scanner (System.in);
int n=input.nextInt();
int[] a=new int[n];
int t=0;
int min=0;
int s=0;
int i=0;

for(i=0;i<n;i++){
 a[i]=input.nextInt();
}

for(int l=0;l<n-1;l++){
min=a[l];
s=l;
for(int j=l+1;j<n;j++){
if(a[j]<min){
min=a[j];
s=j;
}
}
  t=a[l];
  a[l]=a[s];
  a[s]=t;
}
for(int k=0;k<n;k++){
System.out.println(a[k]);
}
}
}