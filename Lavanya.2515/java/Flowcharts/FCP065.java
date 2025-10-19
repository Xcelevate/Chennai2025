import java.util.*;
public class FCP065 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(); 
int m=sc.nextInt();
  
int[] arr = new int[n];
int [] arr1=new int[m];
int[] arr2=new int[n+m];

for (int i = 0; i < n; i++) {
 arr[i] = sc.nextInt();}
for (int i = 0; i < m; i++) {
 arr1[i] = sc.nextInt();}

for(int i=0; i<n; i++){
 arr2[i]=arr[i];}
for(int i=0; i<m; i++){
 arr2[n+i]=arr1[i];}

for (int i = 0; i < (n+m)- 1; i++) {
  int key = i;
for (int j = i + 1; j < n+m; j++) {
if (arr2[j] < arr2[key]) {
  key = j;}}
 int temp = arr2[key];
     arr2[key] = arr2[i];
     arr2[i] = temp;}

int k = n+m;
double median;

if(k% 2 == 1) {
    median = arr2[k/2];}
 else {
    median = (arr2[k/2 - 1] + arr2[k/2]) / 2.0;
}

System.out.println(median);


}}







  






