import java.util.*;
public class FCP058{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int[]a=new int[n+1];
for(int i=0;i<n;i++){
a[i]=ab.nextInt();
}
int b =ab.nextInt();
b=b-1;
int c =ab.nextInt();
for(int j=n;j>b;j--){
a[j]=a[j-1];
}
a[b]=c;
for (int k =0;k<n+1;k++){
System.out.println(a[k]);
}
}
}