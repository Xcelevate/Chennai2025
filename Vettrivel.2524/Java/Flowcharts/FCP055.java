import java.util.*;
public class FCP055{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
int[] arr = new int[n];
boolean u = false;
for(int i=0;i<n;i++){
arr[i]=scanner.nextInt();
}
int T=scanner.nextInt();
for(int j=0;j<n;j++){
if(arr[j]==T){
u = true;
}
}
if(u){
System.out.println("Yes");
}
else{
System.out.println("No");
}

}
}

