import java.util.*;
public class FCP064{
public static void main(String[]args){
Scanner in = new Scanner(System.in);

int n=in.nextInt();
int m=in.nextInt();
int[] A=new int[n];
int[] B=new int[m];
int[] C=new int[n+m];

for(int i=0;i<n;i++){
A[i]=in.nextInt();
}

for(int j=0;j<m;j++){
B[j]=in.nextInt();
}

int i=0;
int j=0;
int k=0;
while(i<n && j<m){
if(A[i]<=B[j]){
C[k]=A[i];
i++;
}
else{
C[k]=B[j];
j++;
}
k++;
}
while(i<n){
C[k]=A[i];
i++;
k++;
}
while(j<m){
C[k]=B[j];
j++;
k++;
}

for(int z=0;z<n+m;z++){
System.out.println(C[z]);
}
}
}
