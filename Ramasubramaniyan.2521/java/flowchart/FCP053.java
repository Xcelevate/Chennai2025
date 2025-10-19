import java.util.Scanner;
public class FCP053{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int []arr=new int[a];
for(int i=0;i<a;i++){
arr[i]=i+1;
}
for(int i=0;i<a;i++){
System.out.println(arr[i]);
}
}
}