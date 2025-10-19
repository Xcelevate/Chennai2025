import java.util.*;
public class FCP026{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
long c = 0;
for(int i=a;i<=b;i++){
c += i;
}
System.out.println(c);
}
}
