import java.util.*;

public class FCP096{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
int m = 0;
for(int i=0;i<n-1;i++){
m=0;
int min = arr[i];
for(int j=i+1;j<n;j++){
if(arr[j]<min){
min=arr[j];
m=j;
}
}
if(min!=arr[i]){
arr[m]=arr[i];
arr[i]=min;
}
}
for(int i=0;i<n;i++){
System.out.println(arr[i]);
}

}
}





