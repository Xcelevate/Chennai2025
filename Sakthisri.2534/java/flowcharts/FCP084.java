import java.util.*;
public class FCP084{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int s=2;
int r=0;
int n=input.nextInt();
System.out.print("0");
System.out.println();
for(int j=2;j<=n;j++){
for(int i=1;i<=j;i++){
if(i==1){
System.out.print(s+" ");
r=s*2;
}
else{
System.out.print(r+" ");
s=r;
}
}
System.out.println();
}
}
}

