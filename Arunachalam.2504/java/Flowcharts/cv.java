import java.util.*;
public class cv{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int s1=0,s2=0;
for(int i=1;i<=n/2;i++){
int a=s.nextInt();
s1=s1+a;}
for(int i=1;i<=n/2;i++){
int b=s.nextInt();
s2=s2+b;}
int a1,a2;
a1=s1/(n/2);
a2=s2/(n/2);
if(a1==a2){
System.out.println("Balanced");
}
else{
System.out.println("Unbalanced");}}}