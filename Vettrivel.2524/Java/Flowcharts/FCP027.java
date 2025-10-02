import java.util.*;

public class FCP027{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
double N = sc.nextDouble();
double sum = 1;
for(double i=2;i<=N;i++){
double f = 1/i;
sum = sum+f;
}
System.out.printf("%.2f",sum);
}
}