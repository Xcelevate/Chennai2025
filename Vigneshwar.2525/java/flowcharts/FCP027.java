import java .util.*;
public class FCP027{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int a = in.nextInt();
float b = 0;
int c = 1;
for(int i=c;i<=a;i++){
b = (b+(1.0f/i));
}
System.out.printf("%.2f", b);
}
}
