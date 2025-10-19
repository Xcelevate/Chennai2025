import java.util.*;
public class FCP062{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
for(int i=1; i<=N; i++){
System.out.print("* ");
for(int j=2; j<=i; j++){
if(i>=3 && i<N){
if(j>=2 && j<i){
System.out.print("  ");
}
else{
System.out.print("* ");
}
}
else{
System.out.print("* ");
}
}
System.out.println();
System.out.println();
}
}
}