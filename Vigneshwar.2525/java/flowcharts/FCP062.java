import java.util.*;
public class FCP062{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int n = in.nextInt();

int[] A = new int[n];
int t=0;
for(int i=0;i<n;i++){
A[i]=in.nextInt();
}
int r = in.nextInt();
r=r%n;
for(int x=1;x<=r;x++){

int i=0;
int j=1;
t=A[i];
while(j<n){
A[i]=A[j];
i++;
j++;
}
A[n-1]=t;
}


for(int i=0;i<n;i++){
System.out.println(A[i]);
}
}
}
