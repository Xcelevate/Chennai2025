import java.util.*;
public class FCP035{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();

if(n <= 1){
System.out.println("No");
return;
}

for(int i=2; i*i<=n; i++){
if(n % i == 0){
System.out.println("No");
return;
}
}
System.out.println("Yes");
}
}
