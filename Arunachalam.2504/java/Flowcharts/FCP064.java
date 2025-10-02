import java.util.*;
public class FCP064{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int m=s.nextInt();
int a[]=new int[n];
int b[]=new int[m];
int c[]=new int[n+m];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int j=0;j<m;j++){
b[j]=s.nextInt();
}
int i=0;
int j=0;
int k=0;
while(i<n && j<m){
if(a[i]>b[j]){
c[k]=b[j];
k++;
j++;
}
else{
c[k]=a[i];
k++;
i++;
}
}
while(j<m){
c[k]=b[j];
k++;
j++;
}
while(i<n){
c[k]=a[i];
i++;
k++;
}
for(int r:c){
System.out.println(r);
}
}
}
