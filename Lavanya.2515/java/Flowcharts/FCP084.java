import java.util.*;
public class FCP084{
public static void main(String[]args){ 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int z=0;

 System.out.println(z);
z=2;
for(int i=2;i<=n;i++){
  for(int j=1;j<=i;j++){
    
    if(j==1){
         System.out.print(z+" ");
        }
    else{
     System.out.print((z*2)+" "); }
}
z=z*2;
System.out.println(); }
}
}