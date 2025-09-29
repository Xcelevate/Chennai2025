import java.util.*;
public class FCP093{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int i;
int j;
for(i=1; i<=N; i++){
for(j=1; j<N+N; j++){
if(j+i==N+1 || j-i==N-1){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
System.out.println();
}
for(i=N+1; i<N+N; i++){
for(j=1; j<N+N; j++){
if(j+i==N*3-1 || i-j==N-1){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
System.out.println();
}
}
}