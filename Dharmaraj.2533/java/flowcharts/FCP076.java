import java.util.*;
public class FCP076{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);

int n =ab.nextInt();
int[][]  a = new int[n][n];
for(int i = 0;i<n;i++){
for(int j = 0;j<n;j++){
a[i][j] =ab.nextInt();
}
}
int b =a[0][0];
for(int i =0;i<n;i++){
for(int j =0;j<n;j++){
if(b>a[i][j]){
b = a[i][j];
}
}
}
System.out.println(b);
}
}
 