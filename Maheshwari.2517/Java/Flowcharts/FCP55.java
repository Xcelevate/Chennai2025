import java.util.*;
public class FCP55{
public static void main(String[]args){
Scanner m =new Scanner(System.in);
int n=m.nextInt();
int arr[]=new int[n];


int c=0;
for(int i=0;i<n;i++){
arr[i]=m.nextInt();
}
int T=m.nextInt();
for( int i=0 ; i<n ; i++){
    if(arr[i]==T){c=1;}
}
if(c==1){
System.out.println("yes");
}
else{
System.out.println("no");
}
}
}







