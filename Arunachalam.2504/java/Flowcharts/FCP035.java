import java.util.*;
public class FCP035{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
for(int i=1;i<=n;i++){
if(n%i==0){
c=c+1;
}
}
if(c==2){
System.out.println("yes");}
else{System.out.println("no");}}}
