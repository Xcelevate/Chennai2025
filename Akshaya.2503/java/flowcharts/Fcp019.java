import java.util.*;
public class Fcp019{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int bill=sc.nextInt();
float amount;
if (bill <= 50) {
amount = bill * 0.50f;
} else if (bill <= 150) {
amount = (50 * 0.50f) + ((bill - 50) * 0.75f);
} else if (bill <= 250) {
amount = (50 * 0.50f) + (100 * 0.75f) + ((bill - 150) * 1.20f);
} else {
amount = (50 * 0.50f) + (100 * 0.75f) + (100 * 1.20f) + ((bill - 250) * 1.50f);
}
float surcharge = amount * 0.20f;
float total = amount + surcharge;
System.out.println(total); 
}
}
