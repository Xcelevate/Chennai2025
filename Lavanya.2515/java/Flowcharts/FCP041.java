import java.util.*;
public class FCP041{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int A=sc.nextInt();
int B=sc.nextInt();
int Max1=0;
int Max2=0;
int Max3=0;
 if(A>B){
   Max1=A;
   Max2=B;}
 else{
   Max1=B;
   Max2=A;}

for(int i=3;i<=N;i++){
   int C=sc.nextInt();

    if (C > Max1) {
                Max3 = Max2;
                Max2 = Max1;
                Max1 = C;}

             else if (C > Max2) {
                Max3 = Max2;
                Max2 = C;}

             else if (C > Max3) {
                Max3 = C;}
            
 }  
System.out.println(Max3);
}}