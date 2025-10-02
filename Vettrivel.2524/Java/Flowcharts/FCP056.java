import java.util.*;
public class FCP056{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
int[] arr = new int[n];
int sum1=0;
int sum2=0;
for(int i=0;i<n;i++){
arr[i]=scanner.nextInt();
if(arr[i]%2!=0){
sum1+=arr[i];
}
else{
sum2+=arr[i];
}
}
System.out.println(sum1);
System.out.println(sum2);
}
}

