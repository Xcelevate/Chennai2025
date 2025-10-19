import java.util.*;
public class FCP059{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int arr[]=new int[n];
for(int i=1;i<n+1;i++){
arr[i]=scan.nextInt();}
for(int i=0;i<n+1;i++){
if(arr[i]==arr[i+1]){
System.out.println(arr[i]);}}
}
}