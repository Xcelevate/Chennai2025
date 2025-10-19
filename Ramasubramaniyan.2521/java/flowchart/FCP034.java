import java.util.Scanner;
public class FCP034{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int i=1;
while(i<=a){
  while(a%i==0){
		System.out.println(i);
i++;
}
i++;
}
}
}