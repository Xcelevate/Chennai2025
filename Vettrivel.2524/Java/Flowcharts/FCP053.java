import java.util.*;
public class FCP053{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
int[] arr = new int[n];
int m =1;
for(int i=0;i<n;i++){
arr[i]=m;
m +=1;
}
for(int j=0;j<n;j++){
System.out.println(arr[j]);
}



}
}

