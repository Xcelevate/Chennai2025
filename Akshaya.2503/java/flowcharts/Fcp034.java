import java.util.*;
public class Fcp034 {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
int i=1;
while(i<=N){
if(N%i==0){
System.out.println(i);
i++;
}
}
}
}
