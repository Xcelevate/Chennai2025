import java.util.*;
public class FCP075{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int m=Sc.nextInt();
int[][]A=new int[m][m];
int i;
int j;
for(i=0; i<m; i++){
for(j=0; j<m; j++){
A[i][j]=Sc.nextInt();
}
}
for(i=0; i<m; i++){
for(j=i+1; j<m; j++){
int temp=A[i][j];
A[i][j]=A[j][i];
A[j][i]=temp;
}
}
for(i=0; i<m; i++){
for(j=0; j<m; j++){
System.out.print(A[i][j]+" ");
}
System.out.println();
}
}
}