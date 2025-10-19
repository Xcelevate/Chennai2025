import java.util.*;
public class FCP071{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int i=0;
while(n>i){
for(int j=1;a[i]>=j;j++){
System.out.print(">");}
System.out.println();
i++;}}}
 
