import java.util.*;
public class FCP080{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int M = scanner.nextInt();
int[] arr = new int[N];
int[] arr2 = new int[M];
long sum1=0;
long sum2=0;
for(int i=0;i<N;i++){
arr[i]=scanner.nextInt();
sum1=(sum1*10)+arr[i];
}
for(int i=0;i<M;i++){
arr2[i]=scanner.nextInt();
sum2=(sum2*10)+arr2[i];
}
long sum = sum1*sum2;
int s =0;
long b = sum;
while(b!=0){
s+=1;
b/=10;
}
long[] arr3 = new long[s];
for(int j=s-1;j>=0;j--){
long x = sum%10;
arr3[j]=x;
sum/=10;
}
for(int j=0;j<s;j++){
System.out.println(arr3[j]);
}
}
}

