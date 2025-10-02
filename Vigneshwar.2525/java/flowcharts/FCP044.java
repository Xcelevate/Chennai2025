import java.util.*;
public class FCP044{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();

for(int r=1;r<=n;r++){
for(int c=1;c<=r;c++){
System.out.print("* ");
}
System.out.println( );
}
}
}
