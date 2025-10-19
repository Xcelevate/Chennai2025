import java.util.*;
public class FCP070{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] a=new int[n];
int i=0;
for(i=0;i<n;i++){
 a[i]=input.nextInt();
}

int f=input.nextInt(); 

i=0;
int j=n-1;
while(i<=j){
 int mid=i+(j-i)/2;
 if(a[mid]==f){
 System.out.print("yes") ;
 return;
}
 else if(f>a[mid]){
   i=mid+1;
 }
 else if(f<a[mid]){
 j=mid-1;
 }
}

System.out.println("no");
}
}

  
