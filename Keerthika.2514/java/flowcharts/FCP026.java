import java.util.*;
public class FCP026{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();
long sum=0;
for(int i=M;i<=N;i++){
sum=sum+i;
}
System.out.println(sum);
}
}
