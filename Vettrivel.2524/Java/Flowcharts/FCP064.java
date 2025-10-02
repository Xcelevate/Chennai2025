import java.util.*;
public class FCP064{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int M = scanner.nextInt();
int[] arr1 = new int[M];
int N = scanner.nextInt();
int[] arr2 = new int[N];
int d = N+M;
int i=0;
int j=0;
int p=0;
int[] arr3= new int[d];
int c =0;
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
for(int s=0;s<d;s++){
System.out.println(arr3[s]);
}

}
}

