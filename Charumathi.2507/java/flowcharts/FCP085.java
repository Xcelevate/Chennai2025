import java.util.*;
public class FCP085{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
System.out.println(1);
for(int j=2; j<=N; j++){
int c=1;
System.out.print(c);
System.out.print(" ");
for(int i=1; i<j+j-1; i++){
if(i<j){
c++;
System.out.print(c);
System.out.print(" ");
}
else{
c--;
System.out.print(c);
System.out.print(" ");
}
}
System.out.println();
}
}
}