import java.util.*;
public class FCP085{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n<1||n>10){
return;
}
for(int i=1;i<=n;i++){
int p=1;
for(int j=1;j<=i;j++){
if(j==1){
System.out.print(p);
}
else{
System.out.print(" "+p);
}
p++;
}
for(int k=i-1;k>=1;k--){
System.out.print(" "+k);
}
System.out.println();
}
}
}
