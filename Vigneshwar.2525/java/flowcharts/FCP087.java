import java.util.*;
public class FCP087{
public static void main(String[]args){

Scanner in=new Scanner(System.in);
int n=in.nextInt();

for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++){
System.out.print("*");
}
for(int z=1;z<=2*(n-i);z++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}

for(int i=n-1;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print("*");
}
for(int z=1;z<=2*(n-i);z++){
System.out.print(" ");
}
for(int j=1;j<=i;j++){
System.out.print("*");
}
System.out.println();
}

}
}
