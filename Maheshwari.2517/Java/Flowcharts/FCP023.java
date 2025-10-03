import java.util.Scanner;

public class FCP023{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
int number = scan.nextInt();
scan.nextLine();
String Name = scan.nextLine();
for(int num = 0; num<number;num++)
{
System.out.println(Name);
}
}
}