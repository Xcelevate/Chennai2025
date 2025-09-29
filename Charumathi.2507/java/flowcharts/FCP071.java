import java.util.*;
public class FCP071{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ] A=new int[ N ];
for(int i=0; i<N; i++){
A[ i ]=Sc.nextInt();
}
for(int j=0; j<N; j++){
for(int k=1; k<=A[ j ]; k++){
System.out.print(">");
}
System.out.println();
}
}
}