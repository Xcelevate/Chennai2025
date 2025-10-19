import java.util.*;
public class FCP029{
    public static void main(String[] args){
Scanner ab = new Scanner(System.in);
int N = ab.nextInt();
int i = 0;
long d = 0;
while(N!=0){
i = N%10;
N = N/10;
d = d + i;
}
System.out.println(d);
}
}

