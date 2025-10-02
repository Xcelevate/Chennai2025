import java.util.*;
public class FCP056{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int sum=0;
int sum1=0;
int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();}
for(int i=0;i<arr.length;i++){
if(arr[i]%2==0){
sum+=arr[i];}
else{
sum1+=arr[i];}
}
System.out.println(sum1);
System.out.println(sum);
}
}