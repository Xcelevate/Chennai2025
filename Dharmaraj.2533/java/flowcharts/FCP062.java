import java.util.*;
public class FCP062{
public static void main(String[]args){
Scanner ab= new Scanner(System.in);
int n = ab.nextInt();
int []a=new int[n];
for(int i =0;i<n;i++){
a[i]=ab.nextInt();
}
int c =ab.nextInt();
for(int i=0;i<n;i++){
if(i!=c){
System.out.print(a[i+1]);
}
else
