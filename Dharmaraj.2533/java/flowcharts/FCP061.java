import java.util.*;
public class FCP061{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);

int n=ab.nextInt();
int[] a = new int[n];
for(int i = 0;i<n;i++){
a[i]=ab.nextInt();
}

int c=1;

for(int i = 0;i<n;i++){ 

int j=i+1;
if(a[i]==0){
continue;
}

while(j<n){
if(a[i]==a[j]){
a[j]=0;
c++;
}
j++;
}

System.out.println(a[i] + " - " + c);
c=1;
}
}
}