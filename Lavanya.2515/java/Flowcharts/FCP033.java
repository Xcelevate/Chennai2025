import java.util.*;
public class FCP033{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int A=N;
int C=0;
int B=0;
while(N!=0){
B=N%10;
C=C*10+B;
N=N/10;}
 if(C==A){
   System.out.println("Yes");}
 else{
   System.out.println("No");}
}}
