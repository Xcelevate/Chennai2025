import java.util.*;
public class FCP046{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
for(int j=1; j<=N; j++){
System.out.print("* ");
for(int i=1; i<=j; i++){
if(j>2){
if(i<=j-1){
System.out.print(" ");
}
}
else{
System.out.print("* ");
}
}
System.out.println();
}
}
}