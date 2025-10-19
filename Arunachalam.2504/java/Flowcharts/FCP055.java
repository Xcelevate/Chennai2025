import java.util.*;
public class FCP055{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
int i=0;
while(n>i){
arr[i]=s.nextInt();
i++;
}
int t=s.nextInt();
i=0;
int c=0;
while(n>i){
if(arr[i]==t){
c=c+1;
}
i++;}
if(c>=1){
System.out.println("yes");}
else{
System.out.println("no");}}}

