import java.util.*;

public class FCP016{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();

if(N%400==0){
System.out.println("Yes");
}
else if(N%4==0){
if(N%100==0){
System.out.println("No");
}
else{
System.out.println("Yes");
}
}
else{
System.out.println("No");
}


}
}