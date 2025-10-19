import java.util.*;
public class FCP076{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int m=Sc.nextInt();
int[ ][ ]arr=new int[m][m];
int i=0;
int j=0;
for(i=0; i<m; i++){
for(j=0; j<m; j++){
arr[i][j]=Sc.nextInt();
}
}
int min=arr[0][0];
for(i=0; i<m; i++){
for(j=0; j<m; j++){
if(arr[i][j]<min){
min=arr[i][j];
}
}
}
System.out.println(min);
}
}