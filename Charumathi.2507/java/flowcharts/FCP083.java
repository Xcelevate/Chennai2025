import java.util.*;
public class FCP083{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int c=1;
for(int j=1; j<=N; j++){
for(int i=1; i<=j; i++){
System.out.print(c);
System.out.print(" ");
c++;
}
System.out.println();
}
}
}