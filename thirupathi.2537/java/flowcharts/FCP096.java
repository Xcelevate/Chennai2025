import java.util.Scanner;
public class FCP096 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int min = 0;
int[] arr = new int[n];
for(int i=0;i<n;i++) {
 arr[i] = sc.nextInt();
}
for(int i=0; i<n; i++) {
min = i;
for(int j = i + 1; j<n; j++) {
if(arr[min] < arr[j]) {
min = j;
}
}
int temp = arr[i];
arr[i] = arr[min];
arr[min] = temp;
}
for(int i=n-1; i>=0; i--) {
System.out.println(arr[i]);
}
}
}