import java.util.*;
public class FCP054{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
int[] arr = new int[n];
int[] arr2 = new int[n];
for(int i=0;i<n;i++){
arr[i]=scanner.nextInt();
arr2[i]=arr[i];
}
int k=n-1;
for(int j=0;j<n;j++){
arr[j]=arr2[k];
k=k-1;
}
for(int l=0;l<n;l++){
System.out.println(arr[l]);
}
}
}

