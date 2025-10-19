import java.util.*;
public class FCP051{
public static void main(String[]agrs){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int sum=0;
int A=0;

while(N>9){
sum=0;
while(N>0){
A=N%10;
sum=sum+A;
N=N/10;}

N=sum;}

System.out.print(N);



}}
