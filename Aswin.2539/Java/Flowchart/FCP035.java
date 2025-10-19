import java.util.*;
public class FCP035{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
boolean d=true;
if(n<=1)
d=false;
else
for(int i=2;i<=n/2;i++){
    if(n%i==0){
d=false;
break;
}
}
if(d){
System.out.println("Yes");}
else{
System.out.println("No");}
}
}