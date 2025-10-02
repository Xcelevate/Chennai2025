import java.util.*;
public class FCP057{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int[]a=new int[n];
int b =ab.nextInt();
for(int i=0;i<n;i++){
a[i]=ab.nextInt();
}

b=b-1;
for(int i =b;i<n-1;i++){
a[i]=a[i+1];
}
for(int d=0;d<n-1;d++){
System.out.println(a[d]);
}

}
}