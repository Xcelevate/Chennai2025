import java.util.*;
public class FCP059{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int arr[]=new int[n];
int g=0;
int dup[]=new int[n];
int i=0;
while(i<n){
arr[i]=s.nextInt();
i++;
}
i=0;
while(i<n){
int count=0;
int j=0;
while(j<n){
if(arr[i]==arr[j]){
count++;
}
j++;
}
int k=0;
while(k<g){
if(dup[k]==arr[i]){
count=0;
break;
}
k++;
}
if(count>1){
dup[g]=arr[i];
g++;
}
i++;
}
i=0;
while(i<g){
System.out.println(dup[i]);
i++;
}
}}
