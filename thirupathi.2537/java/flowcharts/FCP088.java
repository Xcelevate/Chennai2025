import java.util.Scanner;

public class FCP088 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

for (int row = 1; row <= n; row++) {
for (int s = 1; s <= n - row; s++) {
System.out.print("  ");
}
for (int num = n; num >= n - row + 1; num--) {
System.out.print(num + " ");
}
for (int num = n - row + 2; num <= n; num++) {
System.out.print(num + " ");
}
System.out.println();
}

for (int row = n - 1; row >= 1; row--) {
for (int s = 1; s <= n - row; s++) {
System.out.print("  ");
}
for (int num = n; num >= n - row + 1; num--) {
System.out.print(num + " ");
}
for (int num = n - row + 2; num <= n; num++) {
System.out.print(num + " ");
}
System.out.println();
}
}
}
