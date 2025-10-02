import java.util.*;
public class FCP093{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int i=0;
int j=0;
for(j=1;j<=n;j++){
for(i=1;i<=n-j;i++){
 System.out.print(" ");
}
System.out.print("*");
if(j!=1){
for(i=1;i<=j*2-3;i++){
 System.out.print(" ");
}
System.out.print("*");
}
System.out.println();
}
for(j=n-1;j>0;j--){
for(i=1;i<=n-j;i++){
 System.out.print(" ");
}
System.out.print("*");
if(j!=1){
for(i=1;i<=j*2-3;i++){
 System.out.print(" ");
}
System.out.print("*");
}
System.out.println();
}
}
}