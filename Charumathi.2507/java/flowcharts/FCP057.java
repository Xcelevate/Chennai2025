import java.util.*;
public class FCP057{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int M=Sc.nextInt();
int[ ]A=new int[ N ];
for(int i=0; i<N; i++){
A[ i ]=Sc.nextInt();
}
for(int i=0; i<N; i++){
if(i+1==M){
continue;
}
else{
System.out.println(A[ i ]);
}
}
}
}