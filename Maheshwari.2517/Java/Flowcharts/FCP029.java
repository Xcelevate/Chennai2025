import java.util.Scanner;
public class FCP029{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
int M = scanner.nextInt(); 
int sum =0;
while (M > 0){
int digit = M % 10 ;
sum +=  digit ;
M= M/10;
}
System.out.println(sum);
}
} 
