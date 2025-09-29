import java.util.*;
public class FCP056{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ]A=new int[ N ];
int even=0;
int odd=0;
for(int i=0; i<N; i++){
A[ i ]=Sc.nextInt();
}
for(int j=0; j<N; j++){
if(A[ j ]%2==0){
even=even+A[ j ];
}
else{
odd=odd+A[ j ];
}
}
System.out.println(odd);
System.out.println(even);
}
}