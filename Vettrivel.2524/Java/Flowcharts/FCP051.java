import java.util.*;
public class FCP051{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int sum =0;
int temp = 10;
while(N>9){
while(N!=0){
int x = N %10;
sum+=x;
N/=10;
}
N= sum;
sum=0;
}
System.out.println(N);
}
}

