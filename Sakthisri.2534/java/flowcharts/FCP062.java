import java.util.*;
public class FCP062{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] a=new int[n];
int i=0;
int t=0;

for(i=0;i<n;i++){
 a[i]=input.nextInt();
}

int r=input.nextInt();
int j=1;
for(j=1;j<=r;j++){
 i=0;
 int z=1;
 t=a[i];
 while(z<n){
  a[i]=a[z];
  i++;
  z++;
}
a[n-1]=t;

}
for(i=0;i<n;i++){
 System.out.println(a[i]);
}
}
}