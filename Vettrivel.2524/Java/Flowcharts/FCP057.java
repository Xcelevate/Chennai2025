import java.util.*;
public class FCP057{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
int t = scanner.nextInt();
int[] arr = new int[n];
for(int i=0;i<n;i++){
arr[i]=scanner.nextInt();
}
t=t-1;
for(int j=t;j<n-1;j++){
arr[j]=arr[j+1];
}
n=n-1;
for(int k=0;k<n;k++){
System.out.println(arr[k]);
}
}
}

