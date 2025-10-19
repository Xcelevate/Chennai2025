import java.util.Scanner;
public class FCP075 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[][] arr=new int[n][n];
for(int i=0; i<n; i++) {
for(int j=0; j<n; j++) {
arr[i][j] = sc.nextInt();
}
}
int arr2[][] = new int[n][n];
for(int j=0; j<n; j++) {
for(int i=0;i<n; i++) {
arr2[j][i] = arr[i][j];
System.out.println(arr2[j][i]);
}
}
}
}