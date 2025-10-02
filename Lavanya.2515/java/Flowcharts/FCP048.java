import java.util.*;
public class FCP048{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();

for(int i=M;i<=N;i++){
int A=i;
int sum=0;


int Num = 0;
int D = A;
while (D > 0) {
  Num++;
 D = D / 10;
}
int C=i;
while(C>0){
int B=C%10;
int mul=1;
for(int j=0;j<Num;j++){
mul=mul*B;}
sum=sum+mul;
C=C/10;}

if(A==sum){
System.out.println(A);}
}
}}


