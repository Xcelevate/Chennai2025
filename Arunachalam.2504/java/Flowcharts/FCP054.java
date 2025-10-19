import java.util.*;
public class FCP054{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++){
arr[i]=s.nextInt();
}
int i=n-1;
while(i>=0){
System.out.println(arr[i]);
i--;}
}}