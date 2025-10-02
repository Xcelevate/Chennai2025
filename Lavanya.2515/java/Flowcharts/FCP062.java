import java.util.*;
public class FCP062{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();

int [] array=new int[m];
int [] array2=new int[m];
int count=0;


for(int i=0;i<m;i++){
   array[i]=sc.nextInt();}
 
int k=sc.nextInt();
k=k%m;

for(int i=k;i<m;i++){
    array2[count]=array[i];
    count++;}

for(int i=0;i<k;i++) {
     array2[count] = array[i];
      count++;}
 
for(int i=0; i<m; i++) {
     System.out.println(array2[i]);}
        
    
}}