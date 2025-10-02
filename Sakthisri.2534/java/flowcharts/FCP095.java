import java.util.*;
public class FCP095{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int[] a=new int[n];
int t=0;

for(int i=0;i<n;i++){
  a[i]=input.nextInt();
}

for(int i=1;i<n;i++){
    int k=i;
    int m=i-1;
    while(k>0 && m>=0){
    if(a[m]>a[k]){
      t=a[k];
      a[k]=a[m];
      a[m]=t;
      k--;
      m--; 
     }
     else{
       break;
     }
    }
   } 
for(int i=0;i<n;i++){
  System.out.println(a[i]);
}

}
}

/*INSERTION SORT*/

