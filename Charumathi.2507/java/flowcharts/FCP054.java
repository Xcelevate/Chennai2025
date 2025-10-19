import java.util.*;
public class FCP054{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ] A=new int[ N ];
for(int i=0; i<N; i++){
A[ i ]=Sc.nextInt();
}
for(int j=N-1; j>=0; j--){
System.out.println(A[ j ]);
}
}
}