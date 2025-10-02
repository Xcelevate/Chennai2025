import java.util.*;

public class FCP017{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int max = 0;
int min = 0;

if(A>B){
max = A;
min = B;
}
else{
max = B;
min = A;
}
if(max<C){
min = max;
max = C;
}
else if(min<C){
min = C;
}
else{
}

System.out.println(min);


}
}