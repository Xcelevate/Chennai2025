import java.util.*;
public class FCP040{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int M1=0;
int M2=0;
for(int i=1; i<=N; i++){
int A=Sc.nextInt();
if(A>M1){
M2=M1;
M1=A;
}
else if(A>M2){
M2=A;
}
}
System.out.println(M2);
}
}
