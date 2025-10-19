import java.util.*;
public class FCP026{
    public static void main(String[] args){
Scanner ab = new Scanner(System.in);
int M = ab.nextInt();
int N = ab.nextInt();
long sum = 0;
for (int i = M;i<=N;i++){
sum = sum + i;
}
System.out.println(sum);
}
}