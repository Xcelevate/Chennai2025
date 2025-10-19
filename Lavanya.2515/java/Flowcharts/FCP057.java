import java.util.*;
public class FCP057{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=sc.nextInt();
int [] array=new int[n];
int element=0;

for(int i=0;i<n;i++){
 array[i]=sc.nextInt();}

for(int i=0;i<n;i++){
element=m-1;
if(element==i){
continue;}
else{
System.out.println(array[i]);}}
}}




 