import java.util.*;
public class FCP065{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int M = scanner.nextInt();
int[] arr1 = new int[M];
int N = scanner.nextInt();
int[] arr2 = new int[N];
int d = M+N;
int[] arr3 = new int[d];
int i=0;
int j=0;
int p=0;
for(i=0;i<M;i++){
arr1[i]=scanner.nextInt();
}
for(j=0;j<N;j++){
arr2[j]=scanner.nextInt();
}
i=0;
j=0;
while(i<M && j<N){
if(arr1[i]>arr2[j]){
arr3[p]=arr2[j];
p++;
j++;
}
else{
arr3[p]=arr1[i];
p++;
i++;
}
}
while(i<M){
arr3[p]=arr1[i];
p++;
i++;
}
while(j<N){
arr3[p]=arr2[j];
p++;
j++;
}
int mid=d/2;
if(d%2!=0){
System.out.println((float)arr3[mid]);
}
else{
float g = arr3[mid]+arr3[mid-1];
float h = (float)g/2;
System.out.println((float)h);
}


}
}