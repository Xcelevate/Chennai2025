import java.util.Scanner;
public class FCP096{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}import java.util.Scanner;
public class FCP096{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}import java.util.Scanner;
public class FCP096{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}import java.util.Scanner;
public class FCP096{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
}
for(int i=0;i<n-1;i++){
for(int j=i+1;j<n;j++){
if(a[i]>a[j]){
int temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(int i=0;i<n;i++){
System.out.println(a[i]);
}
}
}