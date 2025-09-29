import java.util.*;
public class FCP068{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int [ ]a=new int [N];
int i=0;
int j;
for(i=0; i<N; i++){
a[i]=Sc.nextInt();
}
int S=Sc.nextInt();
for(i=0; i<N; i++){
int Sum=0;
for(j=i; j<N; j++){
Sum+=a[j];
if(Sum==S){
for(int k=i; k<=j; k++){
System.out.println(a[k]);
}
return;
}
}
}
}
}