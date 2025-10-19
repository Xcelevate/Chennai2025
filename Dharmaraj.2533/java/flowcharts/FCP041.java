import java.util.*;
public class FCP041{
public static  void main(String[]args){
Scanner ab= new Scanner(System.in);
int a = ab.nextInt();
int d = 1;
for(int i=1;i<=a;i++){
for(int j=i;j<=a;j++){
System.out.print("*");

}
for(int k=1;k<=a;k++){
 System.out.print(" ");
}
System.out.println();
}
}
}