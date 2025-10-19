import java.util.*;
public class FCP061{
public static void main(String[]args){
Scanner in = new Scanner(System.in);

int n=in.nextInt();
int[] A = new int[n];
for(int i = 0;i<n;i++){
A[i]=in.nextInt();
}

int count=1;

for(int i = 0;i<n;i++){ 

int j=i+1;
if(A[i]==0){
continue;
}

while(j<n){
if(A[i]==A[j]){
A[j]=0;
count++;
}
j++;
}

System.out.println(A[i] + " - " + count);
count=1;
}
}
}