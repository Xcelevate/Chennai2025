import java.util.*;
public class FCP092{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int i;
int j;
for(i=1; i<=N; i++){
for(j=1; j<=N; j++){
if(i==1 || i==N){
System.out.print("*"+" ");
}
else if(j==1 || j==N){
System.out.print("*"+" ");
}
else{
System.out.print("  ");
}
}
System.out.println("  ");
}
}
}