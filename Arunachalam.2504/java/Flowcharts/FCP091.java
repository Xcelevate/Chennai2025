import java.util.Scanner;
public class FCP091{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int N=sc.nextInt();
for(int i=0;i<N;i++){
for(int s=0;s<i;s++){
System.out.print("  ");
}
for(int j=N-i;j<=N;j++){
System.out.print(j);
if(j!=N)System.out.print("_");
}
for(int j=N-1;j>N-i;j--){
System.out.print("_"+j);
}
System.out.println();
}
for(int i=N-2;i>=0;i--){
for(int s=0;s<i;s++){
System.out.print("  ");
}
for(int j=N-i;j<=N;j++){
System.out.print(j);
if(j!=N)System.out.print("_");
}
for(int j=N-1;j>N-i;j--){
System.out.print("_"+j);
}
System.out.println();
}
}
}
