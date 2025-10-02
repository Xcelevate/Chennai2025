import java.util.*;
public class FCP082{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int z=0;
for(int r=0;r<=n;r++){

for(int c=1;c<=n-r;c++){
System.out.print("* ");
}
for(int s=1;s<=r;s++){
System.out.print("  ");
}
System.out.println();
}
}
}
