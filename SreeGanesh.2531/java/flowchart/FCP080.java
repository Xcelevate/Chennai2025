import java.util.Scanner;
public class FCP080{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
int[] a=new int[n];
int[] a2=new int[m];
long s1=0;
long s2=0;
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
s1=(s1*10)+a[i];
}
for(int i=0;i<m;i++){
a2[i]=scn.nextInt();
s2=(s2*10)+a2[i];
}
long sum=s1*s2;
int s=0;
long b=sum;
while(b!=0){
s+=1;
b/=10;
}
long[] a3=new long[s];
for(int j=s-1;j>=0;j--){
long x=sum%10;
a3[j]=x;
sum/=10;
}
for(int j=0;j<s;j++){
System.out.println(a3[j]);
}
}
}import java.util.Scanner;
public class FCP080{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
int[] a=new int[n];
int[] a2=new int[m];
long s1=0;
long s2=0;
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
s1=(s1*10)+a[i];
}
for(int i=0;i<m;i++){
a2[i]=scn.nextInt();
s2=(s2*10)+a2[i];
}
long sum=s1*s2;
int s=0;
long b=sum;
while(b!=0){
s+=1;
b/=10;
}
long[] a3=new long[s];
for(int j=s-1;j>=0;j--){
long x=sum%10;
a3[j]=x;
sum/=10;
}
for(int j=0;j<s;j++){
System.out.println(a3[j]);
}
}
}import java.util.Scanner;
public class FCP080{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
int[] a=new int[n];
int[] a2=new int[m];
long s1=0;
long s2=0;
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
s1=(s1*10)+a[i];
}
for(int i=0;i<m;i++){
a2[i]=scn.nextInt();
s2=(s2*10)+a2[i];
}
long sum=s1*s2;
int s=0;
long b=sum;
while(b!=0){
s+=1;
b/=10;
}
long[] a3=new long[s];
for(int j=s-1;j>=0;j--){
long x=sum%10;
a3[j]=x;
sum/=10;
}
for(int j=0;j<s;j++){
System.out.println(a3[j]);
}
}
}import java.util.Scanner;
public class FCP080{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
int[] a=new int[n];
int[] a2=new int[m];
long s1=0;
long s2=0;
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
s1=(s1*10)+a[i];
}
for(int i=0;i<m;i++){
a2[i]=scn.nextInt();
s2=(s2*10)+a2[i];
}
long sum=s1*s2;
int s=0;
long b=sum;
while(b!=0){
s+=1;
b/=10;
}
long[] a3=new long[s];
for(int j=s-1;j>=0;j--){
long x=sum%10;
a3[j]=x;
sum/=10;
}
for(int j=0;j<s;j++){
System.out.println(a3[j]);
}
}
}import java.util.Scanner;
public class FCP080{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int m=scn.nextInt();
int[] a=new int[n];
int[] a2=new int[m];
long s1=0;
long s2=0;
for(int i=0;i<n;i++){
a[i]=scn.nextInt();
s1=(s1*10)+a[i];
}
for(int i=0;i<m;i++){
a2[i]=scn.nextInt();
s2=(s2*10)+a2[i];
}
long sum=s1*s2;
int s=0;
long b=sum;
while(b!=0){
s+=1;
b/=10;
}
long[] a3=new long[s];
for(int j=s-1;j>=0;j--){
long x=sum%10;
a3[j]=x;
sum/=10;
}
for(int j=0;j<s;j++){
System.out.println(a3[j]);
}
}
}