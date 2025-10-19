import java.util.*;
public class FCP063{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int c =0;
int d =0;
int []a=new int[n];
for(int i =0;i<n;i++){
a[i]=ab.nextInt();
}
for(int i=0;i<n;i++){
if(a[i]==1){
c++;
}
else{
c=0;
}
if(c>d){
d=c;
}
}
System.out.println(d);
}
}
