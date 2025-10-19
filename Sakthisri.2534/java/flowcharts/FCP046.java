import java.util.*;
public class FCP046{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
if (n==1 || n==2){
for(int j=1;j<=n;j++){
for(int i=1;i<=j;i++){
System.out.print("* ");
}
System.out.println();
}
}
else if(n>2){
System.out.println("*");
for(int j=2;j<n;j++){
for(int i=1;i<=j;i++){
if(i==1 || i==j){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.println();
}
for(int k=1;k<=n;k++){
System.out.print("* ");
}
}
}
}
