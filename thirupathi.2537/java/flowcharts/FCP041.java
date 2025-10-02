import java.util.Scanner;
public class FCP041 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int n = scanner.nextInt();
int max1 = Integer.MIN_VALUE;
int max2 = Integer.MIN_VALUE;
int max3 = Integer.MIN_VALUE;
for (int i = 0; i < n; i++) {
int num = scanner.nextInt();
if (num > max1) {
max3 = max2;
max2 = max1;
max1 = num;
} else if (num > max2 && num != max1) {
max3 = max2;
max2 = num;
} else if (num > max3 && num != max1 && num != max2) {
max3 = num;
}
}
if (max3 == Integer.MIN_VALUE) {
System.out.println(max1);
} else {
System.out.println(max3);
}
}
}