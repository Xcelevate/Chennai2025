import java.util.*;
public class FCP073{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);

int n =ab.nextInt();
int[][]  a = new int[n][n];
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
a[i][j] =ab.nextInt();
}  
}

int[][]  b = new int[n][n];
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
b[i][j]=ab.nextInt();
}  
}

for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(a[i][j]+b[i][j]);
}
}
}
}
