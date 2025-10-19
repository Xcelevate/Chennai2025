import java.util.*;
public class FCP027{
    public static void main(String[] args){
Scanner ab = new Scanner(System.in);
int N = ab.nextInt();
double d = 0 ;
for (int c = 1;c<=N;c++){
d = d + (1.0/c);
}
System.out.println(d);
}
}
