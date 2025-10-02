import java.util.*;
public class FCP064{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int n=sc.nextInt();
int [] array1=new int[m];
int [] array2=new int[n];
int [] array3=new int[m+n];
int count=0;
int max=0;

for(int i=0;i<m;i++){
   array1[i]=sc.nextInt();}

for(int j=0;j<n;j++){
   array2[j]=sc.nextInt();}

int i=0,j=0;
                            
while (i < m && j < n) {

if (array1[i] < array2[j]) {
   array3[count]= array1[i];
                i++;}
else {
     array3[count] = array2[j];
                j++;}

            count++;}

while (i < m) {
     array3[count] = array1[i];
            i++;
            count++;}
while (j < n) {
            array3[count] = array2[j];
            j++;
            count++;}
        
for (int k=0; k<m+n; k++) {
   System.out.println(array3[k]);}
        
    
}}



