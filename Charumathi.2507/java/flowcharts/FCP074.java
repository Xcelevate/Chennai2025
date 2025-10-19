import java.util.*;
public class FCP074{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int M=Sc.nextInt();
int [ ][ ]arr1=new int[M][M];
int [ ][ ]arr2=new int[M][M];
int i=0;
int j=0;
for(i=0; i<M; i++){
for(j=0; j<M; j++){
arr1[i][j]=Sc.nextInt();
}
}
for(i=0; i<M; i++){
for(j=0; j<M; j++){
arr2[i][j]=Sc.nextInt();
}
}
for(i=0; i<M; i++){
for(j=0; j<M; j++){
int k=arr1[i][j]-arr2[i][j];
System.out.println(k);
}
}
}
}