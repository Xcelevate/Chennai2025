import java.util.*;
public class FCP063{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int[] arr = new int[N];
int c1=0;
int c2=0;
for(int i=0;i<N;i++){
arr[i]=scanner.nextInt();
}
for(int j=0;j<N;j++){
if(arr[j]==1){
c1+=1;
}
else{
c1=0;
}
if(c1>c2){
c2=c1;
}
}
System.out.println(c2);

}
}

