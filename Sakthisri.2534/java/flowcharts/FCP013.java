import java.util.*;
public class FCP013{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int N=input.nextInt();
int R=0;
int A=0;
R=N%2;
if (R==0)
{
A=N;
System.out.println(A);
}
else
{
A=N*2;
System.out.println(A);
}
}
}
