import java.util.*;
public class FCP039{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int A=sc.nextInt();

int Max=A;
int Min=A;
 
for(int i=2;i<=N;i++){
  int B=sc.nextInt();

 if(B<Min){
        Min=B;}
 if(B>Max){
	Max=B;}
}

System.out.println(Max);

System.out.println(Min);
}}



