import java.util.*;
public class FCP043{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int x = in.nextInt();
double sum = 0;
for(int i=1;i<=n;i++){
sum += Math.pow(x,i)/ (double)i;
}
System.out.println(Math.round(sum));
}
}
