import java.util.*;
public class FCP070{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []array=new int[n];

for(int i=0;i<n;i++){
   array[i]=sc.nextInt();}

int k=sc.nextInt();
int left=0;
int right=n-1;

while(left<=right){
int mid=(left+right)/2; 

if(k == array[mid]){
 System.out.print("Yes");
   return ;}

else if(array[mid]<k){
  left=mid+1;}
else{
     right=mid-1;}
}

System.out.print("No");
}}