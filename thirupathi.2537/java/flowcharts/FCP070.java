import java.util.Scanner;
public class FCP070 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int arr[] = new int[N];
for(int i=0; i<N; i++){
arr[i] = sc.nextInt();
}
int S = sc.nextInt();
int l = 0;
int h = N-1;
int r = -1;
while(l <= h) {
int m = (l + h)/2;
if(arr[m] == S) {
r = m;
break;
}
else if(arr[m] > S){
h = m - 1;
}
else {
l = m + 1;
}
}
if(r == -1){
System.out.println("No");
}else {
System.out.println("Yes");
}
}
}

