import java.util.*;
public class FCP065{
public static void main(String[] args){
Scanner input=new Scanner (System.in);
int m=input.nextInt();
int n=input.nextInt();
int[] a=new int[m];
int[] b=new int[n];
int h= m+n;
int[] c=new int[h];
int i=0;
float s=0;
float d=0;
int x=0;

for(i=0;i<m;i++){
 a[i]=input.nextInt();
}

for(i=0;i<n;i++){
 b[i]=input.nextInt();
}

for(int k=0;k<m;k++){
 c[k]=a[k];
}
for(int j=m;j<h;j++){
 c[j]=b[x];
 x++;
}
Arrays.sort(c);

if(h%2!=0){
int mid = h/2;
System.out.println((float)c[mid]);
}
else{
int mid=h/2;
int g=mid-1;
int o=c[mid]+c[g];

float q = (float)(o)/2;
System.out.println(q);
}
}
}

