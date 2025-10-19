import java.util.*;
public class FCP030{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i=0;
boolean isPerfectSquare = false;
while (i * i <= n) {
if (i * i == n) {
isPerfectSquare = true;
break;
}
i++;
}
if (isPerfectSquare) {
System.out.println("YES");
} 
else {
 System.out.println("No");
}
}
}


