import java.util.*;
public class FCP025{
    public static void main(String[] args){
Scanner ab = new Scanner(System.in);
int N= ab.nextInt();
long c = 0;
for(int i = 1; i<=N; i=i+2 ) {
c = c+i;
}
System.out.println(c);

}
}