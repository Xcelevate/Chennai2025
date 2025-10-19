import java.util.Scanner;
public class FCP056{
public static void main(String[]args){
Scanner m =new Scanner(System.in);
int size=m.nextInt();
int arr[]=new int[size];
int sum=0;
int sum1=0;
for(int i=0;i<size;i++){
arr[i]=m.nextInt();
}
for(int i=0;i<size;i++){
if(arr[i]%2==0){
sum=sum+arr[i];
}
else{
sum1=sum1+arr[i];
}
}
System.out.println(sum1);
System.out.println(sum);
}
}





