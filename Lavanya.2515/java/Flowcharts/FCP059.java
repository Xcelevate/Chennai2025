import java.util.*;
public class FCP059{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] array=new int[n];

for(int i=0;i<n;i++){
 array[i]=sc.nextInt();}

for(int i=0;i<n;i++){
   boolean Dup= false;

   for(int k=0;k<i;k++){
     if(array[k]==array[i]){
        Dup=true;
	break;
               }
    }

            if(Dup){
        continue;}

            for(int j=i+1;j<n;j++){
                if(array[i]==array[j]){
                    System.out.println(array[i]);
                    break; }

}}

}}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               