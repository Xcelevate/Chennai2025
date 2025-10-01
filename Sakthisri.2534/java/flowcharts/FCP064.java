import java.util.*;
public class FCP064{
public static void main(String[]args){
Scanner input= new Scanner(System.in);
int n=input.nextInt();
int m=input.nextInt();
int[] A=new int[n];
int[] B=new int[m];
int[] c=new int[n+m];
for(int i=0;i<n;i++){
 A[i]=input.nextInt();
}
for(int j=0;j<m;j++){
 B[j]=input.nextInt();
}
int j=0;
int i=0;
for(int k=0;k<n+m;k++){
if (k<n){
 c[k]=A[i];
 i++;
}
else{
 c[k]=B[j];
 j++;
}
}
Arrays.sort(c);
for(int k=0;k<n+m;k++){
 System.out.println(c[k]);
}

}
}