import java.util.*;
public class FCP009{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int A=input.nextInt();
int B=input.nextInt();
int C=0;
int R=0;
if (A>B)
{
R=A/B;
C=R*B;
System.out.println(C);
}
else
{
R=B/A;
C=R*A;
System.out.println(C);
}
}
}