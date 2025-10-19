import java.util.*;
public class FCP064{
public static void main(String[]args){
Scanner ab= new Scanner(System.in);

int n=ab.nextInt();
int m=ab.nextInt();
int[] a=new int[n];
int[] b=new int[m];
int[] c=new int[n+m];

for(int i=0;i<n;i++){
a[i]=ab.nextInt();
}

for(int j=0;j<m;j++){
b[j]=ab.nextInt();
}

int i=0;
int j=0;
int k=0;
while(i<n && j<m){
if(a[i]<=b[j]){
c[k]=a[i];
i++;
}
else{
c[k]=b[j];
j++;
}
k++;
}
while(i<n){
c[k]=a[i];
i++;
k++;
}
while(j<m){
c[k]=b[j];
j++;
k++;
}

for(int z=0;z<n+m;z++){
System.out.println(c[z]);
}
}
}
