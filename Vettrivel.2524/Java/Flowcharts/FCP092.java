import java.util.*;

public class FCP092{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();

for(int i=0;i<n;i++){
System.out.print("* ");
}
System.out.println();

for(int i=0;i<n-2;i++){
System.out.print("* ");
for(int k=1;k<n-1;k++){
System.out.print("  ");
}
System.out.println("*");
}
if(n!=1){
for(int i=0;i<n;i++){
System.out.print("* ");
}
System.out.println();
}
}
}

