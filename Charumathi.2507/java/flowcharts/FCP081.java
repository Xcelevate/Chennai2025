import java.util.*;
public class FCP081{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
for(int i=1; i<=N; i++){
for(int j=1; j<=N; j++){
if(i+j>=N+1){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.println();
}
}
}