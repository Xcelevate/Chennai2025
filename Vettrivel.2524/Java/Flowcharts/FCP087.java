import java.util.*;

public class FCP087{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int k=(n-1)*2;
int v=0;
int i=0;
int j=0;
int l=n-1;
for(i=0;i<n;i++){
for(j=0;j<=i;j++){
System.out.print("*");
v+=1;
}
for(j=1;j<=k;j++){
System.out.print(" ");
}
while(v!=0){
System.out.print("*");
v--;
}
k-=2;
System.out.println();
}
v=0;
k=2;
for(i=1;i<=n-1;i++){
for(j=l;j>0;j--){
System.out.print("*");
v+=1;
}
for(j=1;j<=k;j++){
System.out.print(" ");
}
while(v!=0){
System.out.print("*");
v--;
}
l-=1;
k+=2;
v=0;
System.out.println();
}


}
}

