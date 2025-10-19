import java.util.*;
public class FCP063{
public static void main(String[]args){
Scanner in = new Scanner(System.in);

int n=in.nextInt();
int[] A=new int[n];

for(int i=0;i<n;i++){
A[i]=in.nextInt();
}


int a=0;
int c=0;
for(int i=0;i<n;i++){

if(A[i]==1){
c++;
}
else{
if(a<c){
a=c;
}
c=0;
}
}
if(a<c){
a=c;
}
System.out.println(a);
}
}


