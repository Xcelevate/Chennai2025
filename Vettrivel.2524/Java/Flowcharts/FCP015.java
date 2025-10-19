import java.util.*;

public class FCP015{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int D = sc.nextInt();
int max1 = 0;
int max2 = 0;
if(A>B){
max1 = A;
}
else{
max1 = B;
}
if(C>D){
max2 = C;
}
else{
max2 = D;
}
if(max1>max2){
System.out.println(max1);
}
else{
System.out.println(max2);
}
}
}


