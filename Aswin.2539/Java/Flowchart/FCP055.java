import java.util.*;
public class FCP055{
public static void main(String [] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
arr[i]=scan.nextInt();}
int k=scan.nextInt();
boolean d=false;
for(int i=0;i<arr.length;i++){
 if(k==arr[i]){
d=true;
break;
}
}
if(d){
System.out.println("Yes");}
 else{
System.out.println("No");}
}
}