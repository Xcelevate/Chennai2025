import java.util.*;
public class FCP076{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int[][] arr = new int[N][N];

for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
arr[i][j]=scanner.nextInt();
}
}
int min=arr[0][0];
for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
if(min>arr[i][j]){
min=arr[i][j];
}
}}
System.out.println(min);
}
}

