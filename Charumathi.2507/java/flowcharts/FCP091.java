import java.util.*;
public class FCP091{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
for(int i=1; i<=N; i++){
int k=N+1;
for(int j=1; j+i<=N*2; j++){
if(j<i){
System.out.print(" ");
continue;
}
else if(j==i){
System.out.print(k-i);
j++;
}
else{
System.out.print(k-1);
k--;
j++;
}
if(j+i<N*2){
System.out.print("_");
}
}
System.out.println();
}
for(int i=N-1; i>=1; i--){
int k=N+1;
for(int j=1; j+i<=N*2; j++){
if(j<i){
System.out.print(" ");
continue;
}
else if(j==i){
System.out.print(k-i);
j++;
}
else{
System.out.print(k-1);
k--;
j++;
}
if(j+i<N*2){
System.out.print("_");
}
}
System.out.println();
}
}
}