import java.util.*;
public class FCP077{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m1[][]=new int[n][n];
int r=0,c=n/2;
for(int k=1;k<=n*n;k++){
m1[r][c]=k;
if(k%n==0){
r++;
}
else{
r--;
c--;
if(r<0){
r+=n;
}
if(c<0){
c+=n;
}}}
for(int i=0;i<n;i++){
for(int j=n-1;j>=0;j--){
System.out.println(m1[i][j]);
}
}
}
}
