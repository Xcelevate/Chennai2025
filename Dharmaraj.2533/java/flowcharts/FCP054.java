import java.util.*;
public class FCP054{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int[]a=new int[n];
for(int i=0;i<n;i++){
a[i]=ab.nextInt();
}
for(int j = n-1;j>=0;j--){
System.out.println(a[j]);
}
}
}