import java.util.*;
public class FCP075{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int R=sc.nextInt();

int [][] a =new int[R][R];


for(int i=0;i<R;i++){
  for(int j=0;j<R;j++){
a[i][j]=sc.nextInt();}}
                           

for(int i=0;i<R;i++){
for(int j=0;j<R;j++){

 System.out.println(a[j][i]+" ");}}

}}