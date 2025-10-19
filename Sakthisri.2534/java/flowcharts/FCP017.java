import java.util.*;
public class FCP017{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int N1=input.nextInt();
int N2=input.nextInt();
int N3=input.nextInt();
int MX=0;
int SX=0;
if (N1>N2){
MX=N1;
SX=N2;
}
else{
MX=N2;
SX=N1;
}
if (N3>MX){
SX=MX;
MX=N3;
}
else if(N3>SX){
SX=N3;
}
System.out.println(SX);
}
}