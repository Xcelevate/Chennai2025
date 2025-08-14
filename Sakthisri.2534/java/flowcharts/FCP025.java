import java.util.*;
public class FCP025{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int N=input.nextInt();
int[]n=new int[N];
for(int k=0;k<N;k++){
 n[k]=input.nextInt();
}
for(int i=0;i<N;i++){
int m=n[i];
int s=0;
for(int j=1;j<=m;j++){
if(j%2!=0){
s=s+j;
}
}
System.out.println(s);

}
}
}
