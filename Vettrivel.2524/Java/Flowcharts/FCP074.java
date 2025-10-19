import java.util.*;
public class FCP074{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int[][] arr = new int[N][N];
int[][] arr2 = new int[N][N];
int[][] arr3 = new int[N][N];

for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
arr[i][j]=scanner.nextInt();
}
}

for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
arr2[i][j]=scanner.nextInt();
}
}

for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
arr3[i][j]=arr[i][j]-arr2[i][j];
}
}
for(int i=0;i<N;i++){
for(int j=0;j<N;j++){
System.out.println(arr3[i][j]);
}
}


}
}

