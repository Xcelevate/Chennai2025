import java.util.*;
public class FCP021{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();
int C=sc.nextInt();
int D=sc.nextInt();
int E=sc.nextInt();
int F=sc.nextInt();
int G=sc.nextInt();
int H=sc.nextInt();
int maxA=0;
int maxB=0;
int maxC=0;
int maxD=0;
int max1=0;
int max2=0;
int max3=0;
int max4=0;
int maxA1=0;
int maxA2=0;
int maxA3=0;
int maxZ=0;
int min1=0;
int min2=0;
int min3=0;
int min4=0;
int minA=0;
int minB=0;
int minC=0;
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
if(E>F)
{
max3=E;
min3=F;
}
else
{
max3=F;
min3=E;
}
if(G>H)
{
max4=G;
min4=H;
}
else
{
max4=H;
min4=G;
}
if(max1>max2)
{
maxA=max1;
maxB=max2;
minA=min1;
}
else
{
maxA=max2;
maxB=max1;
minA=min2;
}
if(max3>max4)
{
maxC=max3;
maxD=max4;
minC=min3;
}
else
{
maxC=max4;
maxD=max3;
minC=min4;
}
if(maxA>maxC)
{
maxA1=maxC;
maxA2=maxB;
maxA3=minA;
}
else
{
maxA1=maxA;
maxA2=maxD;
maxA3=minC;
}
if(maxA1>maxA2)
{
maxZ=maxA1;
}
else
{
maxZ=maxA2;
}
if(maxZ>maxA3)
{
System.out.println(maxZ);
}
else
{
System.out.println(maxA3);
}
}}




















