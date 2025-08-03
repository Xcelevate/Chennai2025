import java.util.*;
public class FCP018{
public static void main(String [] args){
Scanner scan= new Scanner(System.in);
int b=scan.nextInt();
double h, d, total;
if (b <= 10000){
h = b * 0.2;
d = b * 0.8;}
else if (b <= 20000){
h = b * 0.25;
d = b * 0.9;
}
else{
h = b * 0.3;
d = b * 0.95;}
total = b + h + d;
System.out.println(total);
}
} 