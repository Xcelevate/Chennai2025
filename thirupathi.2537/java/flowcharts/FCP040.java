import java.util.Scanner;
public class FCP040 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
int m = 0;
int f = 0;
for(int i=1; i<=n; i++) {
  int k = sc.nextInt();
  if(k > f) {
    m = f;
    f = k;
   } else if(k > m && k < f){
    m = k;
}   }

System.out.println(m);
}
}
 
