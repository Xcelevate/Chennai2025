import java.util.*;
public class FCP084{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
long val=0;
for(int i=1;i<=n;i++){
long temp=val;
for(int j=1;j<=i;j++){
if(j==1){
System.out.print(temp+" ");
temp=temp*2;
}else{
System.out.print(temp+" ");
}
}
System.out.println();
val=val*2;
if(i==1) val=2;
}
}
}
