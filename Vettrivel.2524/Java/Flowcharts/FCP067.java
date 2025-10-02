import java.util.*;
public class FCP067{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int[] arr = new int[N];
int c = 1;
for(int i=0;i<N;i++){
arr[i]=scanner.nextInt();
}
while(c!=0){
c=0;
for(int j=0;j<N-1;j++){
int k=j+1;
if(arr[j]>arr[k]){
int temp=arr[j];
arr[j]=arr[k];
arr[k]=temp;
c+=1;
}
}
}
for(int y=0;y<N;y++){
System.out.println(arr[y]);
}
}
}

