import java.util.*;
public class FCP032{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int count=0;
int i=0;
while(n>=i){
n%i=0;
count=count+1;
i=i+1;
if(count==3){
System.out.println("YES");}
else{
System.out.println("No");}
}}
}