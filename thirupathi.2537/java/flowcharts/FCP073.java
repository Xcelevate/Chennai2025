import java.util.Scanner;
public class FCP073 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[][] arr = new int[n][n];
int[][] arr1 = new int[n][n];
for(int i=0;i<n;i++) {
for(int j=0; j<n;j++) {
arr[i][j] = sc.nextInt();
}
}
for(int i=0;i<n;i++) {
for(int j=0; j<n;j++) {
arr1[i][j] = sc.nextInt();
}
}
for(int i=0; i<n; i++) {
int sum = 0;
for(int j=0; j<n; j++) {
sum = arr[i][j] + arr1[i][j];
System.out.println(sum);
}
}
}
}