import java.util.*;
public class FCP094{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int i;
int j;
for(i=1; i<=N; i++){
for(j=1; j+i<=N*2; j++){
if(i==1 && (i+j)%2==0){
System.out.print("*");
}
else if(j==i || i+j==N*2){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
for(i=N-1; i>=1; i--){
for(j=1; j+i<=N*2; j++){
if(i==1 && (i+j)%2==0){
System.out.print("*");
}
else if(j==i || i+j==N*2){
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println();
}
}
}