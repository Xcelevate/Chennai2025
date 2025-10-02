import java.util.*;
public class FCP050{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n>=2){
int i=2;
while(n>1){
int d=0;
int j=1;
while(j*j<=i){
if(i%j==0){
if(j*j==i){
d=d+1;
}else{
d=d+2;
}}
j++;
}
if(d==2 && n%i==0){
System.out.println(i);
while(n%i==0){
n=n/i;
}
}
i++;
}
}
}}
