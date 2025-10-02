import java.util.*;
public class FCP056{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int[]a=new int[n];
int sum=0;
int sum1=0;
for(int i=0;i<n;i++){
a[i]=ab.nextInt();
}
for(int j = 0 ;j<n;j++){
if(a[j]%2==1){
sum =sum+a[j];
}
else{
sum1 = sum1+a[j];
}
}
System.out.println(sum);
System.out.println(sum1);
}
}

