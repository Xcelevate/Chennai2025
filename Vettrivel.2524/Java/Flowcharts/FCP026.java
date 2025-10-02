import java.util.*;

public class FCP026{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
long M = sc.nextLong();
long N = sc.nextLong();
long sum = 0;
while(M<=N){
sum = sum + M;
M++;
}
System.out.println(sum);


}
}