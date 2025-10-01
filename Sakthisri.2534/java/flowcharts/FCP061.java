import java.util.*;
public class sakthi{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] A=new int[n];
int[] B=new int[n];
for(int i=0;i<n;i++){
 A[i]=input.nextInt();
}
int j=0;
int c=0;
for(int i=0;i<n;i++){
 if(A[i]==A[i+1]){
  B[j]=A[i];
  for(int k=0;k<j;k++){
   if(B[k]==A[i]){
     c=c+1;
     }
   }
   if(c==1){
     System.out.println(A[i]);
   }
   c=0;
}
}
}
}
