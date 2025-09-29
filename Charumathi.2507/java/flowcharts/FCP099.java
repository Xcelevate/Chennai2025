import java.util.*;
public class FCP099{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int i=0;
int s=1;
for(int c=1; c<=N; c++){
s=s+i;
System.out.print(s+ " ");
i++;
}
}
}