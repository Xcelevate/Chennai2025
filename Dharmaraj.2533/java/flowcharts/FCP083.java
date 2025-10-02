import java.util.*;
public class FCP083{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int b = 1;
for(int i=0;i<a;i++){
for(int j = 0;j<=i;j++){
System.out.print(b+" ");
b++;
}
System.out.println();
}
}
}