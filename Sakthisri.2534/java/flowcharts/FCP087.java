import java.util.*;
public class FCP087{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
for(int j=1;j<=n;j++){
  for(int k=1;k<=j;k++){
    System.out.print("*");
  }
 for(int k=1;k<=(n*2)-(2*j);k++){
  System.out.print(" ");
 }
 
 for(int k=1;k<=j;k++){
  System.out.print("*");
 }
System.out.println();
}
for(int j=n-1;j>=1;j--){
  for(int k=1;k<=j;k++){
   System.out.print("*");
  }
for(int k=1;k<=(n*2)-(2*j);k++){
 System.out.print(" ");
 }
for(int k=1;k<=j;k++){
System.out.print("*");
}
System.out.println();
}
}
}



