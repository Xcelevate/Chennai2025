import java.util.*;
public class FCP084{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();

if(n>=1){
System.out.print("0");
}
System.out.println();
int z=2;
if(n>=2){
for(int r=2;r<=n;r++){
for(int c=1;c==1;c++){
System.out.print(z+" ");
z=z*2;
for(int c2=2;c2<=r;c2++){
System.out.print(z+" ");
}
}
System.out.println();
}
}
}
}