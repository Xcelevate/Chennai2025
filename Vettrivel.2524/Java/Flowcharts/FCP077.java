import java.util.*;
public class FCP077{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int[][] arr = new int[N][N];
int k=1;
int l=(N^2)-1;
int mid=N/2;
int m=mid;
int n=1;
int j=0;
for(int i=0;i<N;i++){
if(i<=mid){
for(j=0;j<m;j++){
arr[i][j]=l;
l-=2;
}
m--;
j++;
for(int u=0;u<n;u++){
arr[i][j]=k;
j++;
k+=2;
}
n+=2;
for(int p=j;p<N;p++){
arr[i][p]=l;
l-=2;
}
}
else{
n-=4;
m=1;
for(j=0;j<m;j++){
arr[i][j]=l;
l-=2;
}
m++;
j++;
for(int u=0;u<n;u++){
arr[i][j]=k;
}
for(int p=j;p<N;p++){
arr[i][j]=l;
l-=2;
}

}
}


for(int i=0;i<N;i++){
for(j=0;j<N;j++){
System.out.println(arr[i][j]);
}
}


}
}

