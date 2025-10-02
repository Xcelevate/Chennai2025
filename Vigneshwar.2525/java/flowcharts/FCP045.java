import java.util.*;
public class FCP045{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int s = 0;

for(int r=1;r<=n;r++){
for(int c=1;c<=n-r;c++){
System.out.print("  ");
}
for(int c=1;c<=(r*2)-1;c++){
System.out.print("* ");
}

System.out.println();
}
}
}