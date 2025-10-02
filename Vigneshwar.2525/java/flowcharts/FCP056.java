import java.util.*;
public class FCP056{
public static void main(String[]args){
Scanner in = new Scanner(System.in);

int n=in.nextInt();
int[] A = new int[n];
int even=0;
int odd=0;
for(int i = 0;i<n;i++){
A[i]=in.nextInt();
}

for(int i = 0;i<n;i++){
if(A[i]%2==0){
even = even+A[i];
}
else{
odd = odd+A[i];
}
}
System.out.println(odd);
System.out.println(even);
}
}

