import java.util.*;
public class FCP061{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int n = scanner.nextInt();
int[] arr = new int[n];
int[] dup = new int[n];
int[] cou = new int[n];
int m=0;
for(int i=0;i<n;i++){
arr[i]=scanner.nextInt();
}
for(int j=0;j<n;j++){

boolean g=true;

for(int v=0;v<m;v++){
if(arr[j]==dup[v]){
g=false;
break;
}
}

if(g){
int c=0;
for(int l=0;l<n;l++){
if(arr[j]==arr[l]){
c+=1;
}
}
dup[m]=arr[j];
cou[m]=c;
m++;
}
}



for(int l=0;l<m;l++){
System.out.println(dup[l]+" - "+cou[l]);
}


}
}

