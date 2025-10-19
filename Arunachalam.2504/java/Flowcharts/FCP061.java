import java.util.*;
public class FCP061{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i=0;
while(i<n){
a[i]=s.nextInt();
i++;
}
int g=0;
int freq[]=new int[n];
i=0;
while(i<n){
int count=0;
int j=0;
while(j<n){
if(a[i]==a[j]){
count++;
}
j++;
}
int k=0;
while(k<g){
if(freq[k]==a[i]){
count=0;
break;
}
k++;
}
if(count>0){
freq[g]=a[i];
System.out.println(a[i]+" - "+count);
g++;
}
i++;
}
}}
