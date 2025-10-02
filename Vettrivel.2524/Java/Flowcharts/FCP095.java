import java.util.*;

public class FCP095{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}

for(int i=0;i<n-1;i++){
int j = i+1;
if(arr[i]>arr[j]){
if(i==0){
int temp=arr[j];
arr[j]=arr[i];
arr[i]=temp;
}
else{
int k=0;
while(k<j){
if(arr[k]<arr[j]){
k++;
}
else{
int h = arr[j];
for(int y=j;y>k;y--){
arr[y]=arr[y-1];
}
arr[k]=h;
break;
}
}
}
}

}
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}

}
}





