import java.util.*;
public class FCP031{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int r=0;
int d=0;
while(n!=0){
r=n%10;
d=(d*10)+r;
n=n/10;
}
System.out.println(d);
}
}
