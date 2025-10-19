import java.util.Scanner;
public class FCP080 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
int m = sc.nextInt();
int[] arr1 = new int[m];
int a = 0;
int b = 0;
for(int i=0; i<n; i++) {
arr[i] = sc.nextInt();
a = a * 10 + arr[i];
}
for(int j=0; j<m; j++){
arr1[j] = sc.nextInt();
b = b * 10 + arr1[j];
}
int product = a * b;
String s = Integer.toString(product);
int[] ab = new int[s.length()];
for(int i=0; i < s.length(); i++) {
ab[i] = s.charAt(i) -'0';
}
for(int j : ab){
System.out.println(j);
}
}
}