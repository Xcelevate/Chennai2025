import java.util.*;
public class FCP088{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;n>=i;i++){
int x=n;
int c=0;
for(int j=n-i;j>=1;j--){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print(x);
x=x-1;
}
int y=x+2;
for(int k=1;k<i;k++){
System.out.print(y);
y=y+1;}
System.out.println();}
for(int i=n-1;i>=1;i--){
int x=n;
int c=0;
for(int j=n-i;j>=1;j--){
System.out.print(" ");
}
for(int k=1;k<=i;k++){
System.out.print(x);
x=x-1;
}
int y=x+2;
for(int k=1;k<i;k++){
System.out.print(y);
y=y+1;}
System.out.println();}
}}
