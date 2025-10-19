import java.util.*;
public class FCP078{
public static void main(String[]args){

Scanner in=new Scanner(System.in);
int n=in.nextInt();
int[][] A=new int[n][n];

int top=0,bottom=n-1;

int left=0,right=n-1;
int num=1;
while(top<=bottom && left<=right){

for(int i=left;i<=right;i++){
A[top][i]=num++;
}
top++;
for(int i=top;i<=bottom;i++){
A[i][bottom]=num++;
}
right--;

for(int i=right;i>=left;i--){
A[bottom][i]=num++;
}


bottom--;

for(int i=bottom;i>=top;i--){
A[i][left]=num++;
}
left++;

}

for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.println(A[i][j]);
}

}
}
}