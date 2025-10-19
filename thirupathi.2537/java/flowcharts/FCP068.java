import java.util.Scanner;
public class FCP068 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int arr[] = new int[N];
for(int i=0; i<N; i++){
arr[i] = sc.nextInt();
}
int S = sc.nextInt();
int k = 0;
int sum = 0;
for(int i=0; i<N-1; i++){
sum = sum + arr[i];
while(sum > S && k <= i){
sum = sum - arr[k];
k = k + 1;
}
if(S == sum){
for(int j = k; j<=i; j++){
System.out.println(arr[j]);
}
break;
}
}
}
}