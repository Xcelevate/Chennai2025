import java.util.*;
public class FCP094 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int n = input.nextInt();
for (int i = 0; i < n; i++) {
for (int j = 0; j < i; j++) System.out.print(" ");
if (i == 0 || i == n - 1) {
for (int j = 0; j < n - i; j++) System.out.print("* ");
} else {
System.out.print("*");
for (int j = 0; j < (2 * (n - i - 1) - 1); j++) System.out.print(" ");
System.out.print("*");
}
System.out.println();
}
for (int i = n - 2; i >= 0; i--) {
for (int j = 0; j < i; j++) System.out.print(" ");
if (i == 0 || i == n - 1) {
for (int j = 0; j < n - i; j++) System.out.print("* ");
} else {
System.out.print("*");
for (int j = 0; j < (2 * (n - i - 1) - 1); j++) System.out.print(" ");
System.out.print("*");
}
System.out.println();
}
}
}
