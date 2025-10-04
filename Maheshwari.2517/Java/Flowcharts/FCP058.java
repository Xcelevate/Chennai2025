import java.util.*;
public class FCP058{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int n = sc.nextInt();
int arr[]=new int[n+1];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

int m =sc.nextInt();
int x =sc.nextInt();


for( int i=n-1;i>=m-1;i--){
arr[i+1]=arr[i];
}
arr[m-1]=x;



for( int i=0;i<n+1;i++){
System.out.println(arr[i]);
}
}
}


 




