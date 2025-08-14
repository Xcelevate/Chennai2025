import java.util.*;
public class FCP014{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int N1=input.nextInt();
int N2=input.nextInt();
int N3=input.nextInt();
int MX=0;
if (N1>N2)
{
MX=N1;
}
else
{
MX=N2;
}
if (MX>N3)
{
MX=MX;
}
else
{
MX=N3;
}
System.out.println(MX);
}
}
