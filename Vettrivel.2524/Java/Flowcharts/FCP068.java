import java.util.*;
public class FCP068{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int[] arr = new int[N];
for(int i=0;i<N;i++){
arr[i]=scanner.nextInt();
}
int t = scanner.nextInt();
int sum = 0;
int d=0;
int[] ans= new int[N];
for(int i=0;i<N;i++){
d=0;
sum=0;
ans[d]=arr[i];
sum+=ans[d];
d++;
if(sum==t){

for(int k=0;k<d;k++){
System.out.println(ans[k]);
}
return;
}
for(int j=i+1;j<N;j++){
ans[d]=arr[j];
sum+=ans[d];
d++;
if(sum==t){

for(int k=0;k<d;k++){
System.out.println(ans[k]);
}
return;
}
}
}

}
}

