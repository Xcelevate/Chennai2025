import java.util.*;
public class FCP053{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int i=0;
int j=1;
while(n>i){
a[i]=j;
System.out.println(a[i]);
j++;
i++;
}}}