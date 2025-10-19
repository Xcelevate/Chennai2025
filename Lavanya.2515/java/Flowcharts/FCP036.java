import java.util.*;
public class FCP036{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();
int A=M;
int B=N;
int HCF=1;
long LCM=0;
int Min=0;

if(M<N){
Min=M;}
else{
Min=N;}

for(int i=1;i<=Min;i++){
if(M%i==0 && N%i==0){
  HCF=i;}}

LCM=((long)A*B)/HCF;

System.out.println(HCF);
System.out.println(LCM);
}}