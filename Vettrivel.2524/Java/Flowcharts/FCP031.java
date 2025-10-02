import java.util.*;
public class FCP031{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int sum  = 0;
while(N!=0){
int x  =  N % 10 ;
sum = (sum*10)+x;
N = N/10;
}
System.out.println(sum);
}
}

