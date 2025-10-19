import java.util.*;
public class FCP089{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(i==0||i==n-1){
System.out.print("0");
}
else if(j==0||j==n-1){
System.out.print("x");
}
else if((n%2==1 && j==n/2) || (n%2==0 && (j==n/2-1 || j==n/2))){
System.out.print("0");
}
else if((n%2==1 && i==n/2) || (n%2==0 && (i==n/2-1 || i==n/2))){
System.out.print("x");
}
else{
System.out.print("0");
}
if(j<n-1) System.out.print(" ");
}
System.out.println();
}
}
}
