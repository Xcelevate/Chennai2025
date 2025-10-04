import java.util.*;
public class FCP054{
public static void main(String[]args){
Scanner m =new Scanner(System.in);
int size=m.nextInt();
int arr[]=new int[size];
for(int i=0;i<size;i++){
arr[i]=m.nextInt();
}
for(int i=size-1 ; i>=0 ; i--){
System.out.println(arr[i]);
}
}
}


