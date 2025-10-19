import java.util.*;
public class FCP085{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
for(int j=1;j<=n;j++){
for(int i=1;i<=j;i++){
if(i>1){
System.out.print(" ");
}
System.out.print(i);
}
for(int k=j-1;k>=1;k--){
System.out.print(" "+k);
}
System.out.println();
}
}
}

