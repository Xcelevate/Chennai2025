import java.util.*;
public class db{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int N=s.nextInt();
double X=s.nextDouble();
double S=0.0;

for(int i=1;i<=N;i++){
int power=2*i-1;
double p=1.0;
for(int j=1;j<=power;j++){
p=p*X;
}
double term=p/(power);
if(i%2==0){
term=-term;
}
S=S+term;
}
System.out.println(S);
}}
