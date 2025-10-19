import java.util.*;
public class FCP042{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
if(n<=0){
return;
}
long a = 0;
long b = 1;
for(int i = 0;i<n;i++){
System.out.println(a);
long c = a + b;
a = b;
b = c;
}
}
}
