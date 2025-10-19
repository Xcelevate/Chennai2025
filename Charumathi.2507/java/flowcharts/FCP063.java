import java.util.*;
public class FCP063{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int [ ]A=new int[ N ];
int Max=0;
int c=0;
int i=0;
for(i=0; i<N; i++){
A[ i ]=Sc.nextInt();
}
for(i=0; i<N; i++){
if(A[ i ]==1){
c++;
if(c>Max){
Max=c;
}
}
else{
c=0;
}
}
System.out.println(Max);
}
}
