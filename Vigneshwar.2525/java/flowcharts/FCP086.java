import java.util.*;
public class FCP086{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();

for(int r=1;r<=n;r++){
for(int c=r;c<=n-1;c++){

System.out.print("  ");
}
for(int c1=1;c1<=r;c1++){
System.out.print("* ");
}
for(int c2=2;c2<=r;c2++){
System.out.print("* ");
} 

System.out.println();
}
for(int r=n-1;r>=1;r--){
for(int c=r;c<=n-1;c++){

System.out.print("  ");
}
for(int c1=1;c1<=r;c1++){
System.out.print("* ");
}
for(int c2=2;c2<=r;c2++){
System.out.print("* ");
} 

System.out.println();
}
}
}