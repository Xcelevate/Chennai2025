import java.util.*;
public class FCP074  {
public static void main(String[]args){
Scanner in = new Scanner(System.in);

int n=in.nextInt();
int[][]  A = new int[n][n];
int sum = 0;
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){

A[i][j]=in.nextInt();
}  
}

int[][]  B = new int[n][n];

for(int i = 0;i<n;i++){ 
for(int j = 0;j<n;j++){

B[i][j]=in.nextInt();
}  
}

for(int i=0;i<n;i++){
for(int j=0;j<n;j++){

sum=A[i][j]-B[i][j];
System.out.println(sum);
}
}
}
}