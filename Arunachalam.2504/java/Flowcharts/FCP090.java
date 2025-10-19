import java.util.*;
public class FCP090{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<n;i++){
int start=n-i;
for(int j=0;j<n+1;j++){
int val=start+j;
if(val>n+1) val=2*(n+1)-val;
System.out.print(val+" ");
}
System.out.println();
}
}
}
