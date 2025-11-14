import java.util.Scanner;
public class FCP095{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
}
for(int i=1;i<n;i++){
int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp){
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}
import java.util.Scanner;
public class FCP095{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
}
for(int i=1;i<n;i++){
int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp){
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}
import java.util.Scanner;
public class FCP095{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
}
for(int i=1;i<n;i++){
int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp){
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}
import java.util.Scanner;
public class FCP095{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
}
for(int i=1;i<n;i++){
int temp=a[i];
int j=i-1;
while(j>=0 && a[j]>temp){
a[j+1]=a[j];
j--;
}
a[j+1]=temp;
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}
