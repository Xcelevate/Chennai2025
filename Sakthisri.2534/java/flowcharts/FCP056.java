import java.util.*;
public class FCP056{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int e=0;
int o=0;
int[] A=new int[n];
for(int i=0;i<n;i++){
A[i]=input.nextInt();
}
for(int i=0;i<n;i++){
if(A[i]%2==0){
e=e+A[i];
}
else{
o=o+A[i];
}
}
System.out.println(o);
System.out.println(e);
}
}

