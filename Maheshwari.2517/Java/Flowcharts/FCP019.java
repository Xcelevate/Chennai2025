import java.util.Scanner;
public class FCP019{
public static void main(String[]args){
 Scanner scanner = new Scanner(System.in);
int unit = scanner.nextInt();
double amount = 0;
 if ( unit <= 50){
amount = unit * 0.50;
}
else if (unit <= 150){
amount = 50 * 0.50 + (unit - 50 )* 0.75;
}
else if (unit <= 250){
amount = 50*0.50 + 100 * 0.75 + (unit - 150)  * 1.20;
}
else{

amount = 50*0.50 + 100 * 0.75 + 100 * 1.20 + (unit - 250)* 1.50;
}
double surcharge = amount * 0.20;
double total = amount + surcharge;

System.out.println(total);
}
}