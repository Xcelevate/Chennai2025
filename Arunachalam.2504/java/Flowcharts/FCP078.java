import java.util.*;
public class FCP078{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[n][n];
int p=1;
int rs=0,re=n,cs=0,ce=n;
while((rs<re)&&(cs<ce)){
for(int i=cs;i<ce;i++){
a[rs][i]=p;
p++;}
rs++;
for(int i=rs;i<re;i++){
a[i][ce-1]=p;
p++;
}
ce--;
for(int i=ce-1;i>=cs;i--){
a[re-1][i]=p;
p++;}
re--;
for(int i=re-1;i>=rs;i--){
a[i][cs]=p;
p++;}
cs++;
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(a[i][j]+" ");
}
System.out.println();}}}