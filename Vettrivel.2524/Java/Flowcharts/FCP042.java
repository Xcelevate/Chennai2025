import java.util.*;

public class FCP042{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
long N = sc.nextLong();
long a = 0;
long b = 1;
long c = 0;
for(long i =0;i<N;i++){
System.out.println(c);
a=b;
b=c;
c=a+b;
}
}
}

