import java.util.*;
public class FCP043{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int x=s.nextInt();
double sum=0.0;
long sq=1;
int i=1;
while(i<=n){
sq=1;
int j=1;
while(j<=i){
sq=sq*x;
j++;
}
sum=sum+(double)sq/i;
i++;
}
long ans=(long)(sum+0.5);
System.out.println(ans);
}}
