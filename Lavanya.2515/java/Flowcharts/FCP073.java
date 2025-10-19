import java.util.*;
public class FCP073{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int R=sc.nextInt();

int [][] a =new int[R][R];
int [][] b =new int[R][R];
int [][] c =new int[R][R];

for(int i=0;i<R;i++){
  for(int j=0;j<R;j++){
a[i][j]=sc.nextInt();}}


for(int i=0;i<R;i++){
  for(int j=0;j<R;j++){
b[i][j]=sc.nextInt();}}

for(int i=0;i<R;i++){
for(int j=0; j<R;j++){

c[i][j]=a[i][j]+b[i][j];

 System.out.println(c[i][j]+" ");}
}

}}