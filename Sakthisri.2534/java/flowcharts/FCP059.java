import java.util.*;
public class FCP059{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] A=new int[n];
int i=0;
boolean[] B=new boolean[n];
for(i=0;i<n;i++){
 A[i]=input.nextInt();
}
for(int j=0;j<n;j++){
 if(B[j]){
  continue;
}
int c=0;
 for(i=j+1;i<n;i++){
  if(A[j]==A[i]){
   B[i]=true;
   c++;
  }
}
 if(c>0){
   System.out.println(A[j]);
 
}
}
}
}
/*FIND DUPLICATES*/