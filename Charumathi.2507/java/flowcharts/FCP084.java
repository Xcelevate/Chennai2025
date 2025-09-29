import java.util.*;
public class FCP084{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int m;
int n;
System.out.println(0);
for(int i=1; i<N;i++){
m=(int)Math.pow(2, i);
System.out.print(m+ " ");
int j=2;
while(j<=i+1){
System.out.print(m*2+ " ");
j++;
}
System.out.println();
}
}
}