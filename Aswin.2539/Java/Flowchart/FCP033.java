import java.util.*;
public class FCP033{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int temp=n;
int r=0;
int sum=0;
while(n>0){
r=n%10;
sum=(sum*10)+r;
n=n/10;}
if(temp==sum){
System.out.println("YES");
}
else{
System.out.println("No");
}
}
}