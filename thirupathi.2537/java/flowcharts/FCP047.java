import java.util.Scanner;
public class FCP047 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int h = sc.nextInt();
for(int i = 1; i < N; i++) {
int A = sc.nextInt();
while(A != 0){
int t = h % A;
h = A;
A = t;
}
}
System.out.println(h);
}
}
