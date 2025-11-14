import java.util.Scanner;
public class Matrix{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
if(n<1||n>100){
//System.out.println("Invalid matrix");
return;
}
int[][] a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=scn.nextInt();
}
}
int[][] t=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
t[j][i]=a[i][j];
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(t[i][j]);
}
}
}
}import java.util.Scanner;
public class Matrix{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
if(n<1||n>100){
//System.out.println("Invalid matrix");
return;
}
int[][] a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=scn.nextInt();
}
}
int[][] t=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
t[j][i]=a[i][j];
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(t[i][j]);
}
}
}
}import java.util.Scanner;
public class Matrix{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
if(n<1||n>100){
//System.out.println("Invalid matrix");
return;
}
int[][] a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=scn.nextInt();
}
}
int[][] t=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
t[j][i]=a[i][j];
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(t[i][j]);
}
}
}
}import java.util.Scanner;
public class Matrix{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
if(n<1||n>100){
//System.out.println("Invalid matrix");
return;
}
int[][] a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=scn.nextInt();
}
}
int[][] t=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
t[j][i]=a[i][j];
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(t[i][j]);
}
}
}
}import java.util.Scanner;
public class Matrix{
public static void main(String[]args){
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
if(n<1||n>100){
//System.out.println("Invalid matrix");
return;
}
int[][] a=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
a[i][j]=scn.nextInt();
}
}
int[][] t=new int[n][n];
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
t[j][i]=a[i][j];
}
}
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.println(t[i][j]);
}
}
}
}