import java.util.Scanner;
public class FCP079 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int m = sc.nextInt();
int arr[] = new int[n];
int arr1[] = new int[m];
for(int i=0; i<n; i++) {
arr[i] = sc.nextInt();
}
for(int i=0; i<m; i++) {
arr1[i] = sc.nextInt();
}
long sum = 0;
long sum1 = 0;
for(int i = 0; i<n; i++) {
sum = sum * 10 + arr[i];
}
for(int i = 0; i<m; i++) {
sum1 = sum1 *10 + arr1[i];
}
long sum2 = sum + sum1;
long R = 0;
long s = 0;
while(sum2 > 0){
R = sum2 % 10;
s = s * 10 + R;
sum2 /= 10;
}
while(s > 0){
R = s % 10;
System.out.println(R);
s /= 10;
}

}
}