import java.util.*;
public class FCP040{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int Max1=sc.nextInt();
int Max2=sc.nextInt();

if (Max2 > Max1) {
            int C = Max1;
            Max1 = Max2;
            Max2 = C;
        }
 
for(int i=2;i<N;i++){
   int B=sc.nextInt();

if(B>Max1){
      Max2=Max1;
      Max1=B;}
else if(B>Max2){
    Max2=B;}
}
System.out.println(Max2);

}}