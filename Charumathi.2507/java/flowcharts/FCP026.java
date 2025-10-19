import java.util.*;
public class FCP026{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int M=Sc.nextInt();
int N=Sc.nextInt();
long s=0;
for(int i=M; i<=N; i++){
s=s+i;
}
System.out.println(s);
}
}