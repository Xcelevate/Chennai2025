import java.util.Scanner;
 public class Fcp052{
 public static void main(String[]args){
Scanner kk=new Scanner(System.in);
 int n=kk.nextInt();
  int[]arr=new int[n];
for(int i=0;i<arr.length;i++){
   arr[i]=kk.nextInt();
}
for(int i=0;i<n;i++){
System.out.println(arr[i]);}
}
}