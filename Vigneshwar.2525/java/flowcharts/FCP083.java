import java.util.*;
public class FCP083{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();

int z=1;
for(int r = 1;r<=n;r++){
for(int c = 1;c<=r;c++){
System.out.print(z+" ");
z++;
}
System.out.println();
}
}
}