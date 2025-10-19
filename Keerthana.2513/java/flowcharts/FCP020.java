import java.util.*;
public class FCP020{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
int D=sc.nextInt();
int max1=0;
int min1=0;
int max2=0;
int min2=0;
int mini=0;
int maxi=0;
if(A>B)
{
max1=A;
min1=B;
}
else
{
max1=B;
min1=A;
}
if(C>D)
{
max2=C;
min2=D;
}
else
{
max2=D;
min2=C;
}
if(max1>max2)
{
maxi=max2;
mini=min1;
}
else
{
maxi=max1;
mini=min2;
}
if(maxi>mini)
{
System.out.println(maxi);
}
else
{
System.out.println(mini);
}
}}



