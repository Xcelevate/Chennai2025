import java.util.*;
public class FCP062{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int[] arr = new int[N];
for(int i=0;i<N;i++){
arr[i]=scanner.nextInt();
}
int K = scanner.nextInt();
int m = 0;
while(m!=K){
int z = arr[0];
for(int y = 0;y<N-1;y++){
arr[y] = arr[y+1];
}
arr[N-1]=z;
m+=1;
}
for(int o=0;o<N;o++){
System.out.println(arr[o]);
}


}
}

