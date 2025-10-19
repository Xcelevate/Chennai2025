import java.util.*;
public class FCP092{
public static void main(String[] args){
Scanner input=new Scanner (System.in);
int n=input.nextInt();
int j=0;
int i=0;
int z=0;
for(j=1;j<=n;j++){
 if(j==1 || j==n){
  for(z=1;z<=n;z++){
  System.out.print("* ");
 }
z=1;
}
 else{
  for(i=1;i<=n;i++){
   if(i==1 || i==n){
  System.out.print("* ");
}
 else{
  System.out.print("  ");
}
}
}
System.out.println();
}
}
}
