import java.util.*;
public class FCP050{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

long N = scanner.nextLong();
long s = 0;
long i=2;
if(N==1){
System.out.println();}
else{
while(i<=N){
s =0;
if(N%i==0){
for(long j=2;j<i;j++){
if(i%j==0){
s+=1;
}
}
if(s==0){
System.out.println(i);
}
}
i++;
}}
}
}

