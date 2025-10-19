import java.util.*;
public class FCP059{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
int[] arr = new int[n];
int[] dup= new int[n];
int m =0;
boolean g = true; 
for(int i=0;i<n;i++){
arr[i]=scanner.nextInt();
}
for(int j=0;j<n-1;j++){
for(int k=j+1;k<n;k++){
g=true;
if(arr[j]==arr[k]){
for(int v=0;v<m;v++){
if(dup[v]==arr[j]){
g = false;
break;
}
}
if(g){
dup[m]=arr[j];
m+=1;
}
}
}
}
for(int j=0;j<m;j++){
System.out.println(dup[j]);
}



}
}

