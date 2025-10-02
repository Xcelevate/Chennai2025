import java .util.*;
public class FCP053{
public static void main(String []args){
Scanner ab = new Scanner(System.in);
int n=ab.nextInt();
int[] a = new int[n];
for(int i =0;i<n;i++){
a[i]=i +1;
}
for(int j = 0;j<n;j++){
System.out.println(a[j]);
}
}
}