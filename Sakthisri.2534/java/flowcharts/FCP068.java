import java.util.*;
public class FCP068{
public static void main(String[] args){
Scanner input=new Scanner (System.in);
int n=input.nextInt();
int[] a=new int[n];

for(int i=0;i<n;i++){
 a[i]=input.nextInt();
}

int t=input.nextInt();
int sum=0;
for(int j=0;j<n;j++){
 sum=a[j];
 if(sum==t){
 System.out.println(a[j]);
 return;
 }
for(int i=j+1;i<n;i++){
sum=sum+a[i];
if(sum==t){
for(int x=j;x<=i;x++){
System.out.println(a[x]);
}
return;
}
}
}

System.out.println("nothing");

}
}