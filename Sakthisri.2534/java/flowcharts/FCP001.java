import java.util.*;
public class FCP001{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int DD=input.nextInt();
input.nextLine();
String MM=input.nextLine();
int YY=input.nextInt();
System.out.println(DD);
System.out.println(MM);
System.out.println(YY);
}
}
import java.util.*;
public class Pattern{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int n = input.nextInt(); 
for(int j=1;j<=2*n-1;j++)
{
 if(j==1 &&j==2*n-1)
 {
  for(int i=1;i<=n;i++)
  {
   System.out.print(i);
  }
  for(int i=n-1;i<0;i--)
  {
   System.out.print(i);
  }
  System.out.println();
 }
 if(j>=2 && j<2*n-1){
 for(int i=1;i<=n-j+1;i++)
 {
  System.out.print(i);
 }
 for(int i=1;i<=j-1;i++)
 {
 System.out.print(" ");
 }
 for(int i=n-j+1;i<=0;i--)
 {
  System.out.print(i);
 }
 System.out.println();
}
}
}
}
