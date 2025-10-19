import java.util.*;
public class FCP034{
    public static void main(String[] args){
Scanner ab = new Scanner(System.in);
int N = ab.nextInt();
for (int i = 1; i <=N;i++){
if (N % i == 0){
System.out.println(i);
}
}
}

}