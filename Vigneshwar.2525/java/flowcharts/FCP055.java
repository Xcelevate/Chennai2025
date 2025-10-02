import java.util.*;
public class FCP055{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int[] A = new int[n];
boolean z=false;

for(int i=0;i<n;i++){
A[i]=in.nextInt();
}
int t=in.nextInt();
for(int i=0;i<n;i++){
if(A[i]==t){
System.out.println("yes");
z=true;
break;
}
}
if(z==false){
System.out.println("no");
}
}
}