import java.util.*;
public class FCP058{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
boolean g = true;
int[] arr = new int[n+1];
for(int i=0;i<n;i++){
arr[i]=scanner.nextInt();
}
int t = scanner.nextInt();
int v = scanner.nextInt();
if(t<=0 || t>n+1){
g = false;
}
if(g){
t=t-1;
for(int l=n;l>t;l--){
arr[l]=arr[l-1];
}
arr[t]=v;
for(int k=0;k<n+1;k++){
System.out.println(arr[k]);
}
}
else{
}
}
}

