import java.util.*;
public class FCP079{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int m=Sc.nextInt();
int n=Sc.nextInt();
int [ ]a=new int [m];
int [ ]b=new int [n];
int i;
int j;
for(i=0; i<m; i++){
a[i]=Sc.nextInt();
}
for(i=0; i<n; i++){
b[i]=Sc.nextInt();
}
i=m-1;
j=n-1;
int Carry=0;
int k=0;
int [ ]c=new int [m+n];
while(i>0 || j>0){
int Sum=0;
Sum=a[i]+b[j]+Carry;
if(Sum>9){
Carry=Sum/10;
Sum=Sum%10;
c[k]=Sum;
}
else{
c[k]=Sum;
}
i--;
j--;
k++;
}

}
}
