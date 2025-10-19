import java.util.*;
public class FCP059{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int[]a=new int[n];
int b=0;
int c = 0;
for(int i=0;i<n;i++){
a[i]=ab.nextInt();
}
int y=0;
boolean q = true;
int[] dup = new int[n];
for(int i=0;i<n-1;i++){
q=true;
for(int j=i+1;j<n;j++){
if(a[i]==a[j]){
for(int v=0;v<y;v++){
if(dup[v]==a[i]){
q=false;
}
}
if(q){
dup[y]=a[i];
y++;}
}
}
}
for(int u=0;u<y;u++){
System.out.println(dup[u]);
}
}
}
