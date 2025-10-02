import java.util.*;
public class FCP058{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int [] array=new int[n+1];

for(int i=0;i<n;i++){
 array[i]=sc.nextInt();}

int m=sc.nextInt();
int x=sc.nextInt();

for(int i=n;i>=m;i--){
  array[i]=array[i-1];
}

array[m-1]=x;


for (int i = 0; i <= n; i++) {

System.out.println(array[i]);}

}}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        