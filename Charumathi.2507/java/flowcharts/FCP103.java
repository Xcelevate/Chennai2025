import java.util.*;
public class FCP103{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int i=1;
int j=i+1;
int k=N-(i+j);
int c=0;
while(i<j && j<k){
while(j<k){
if(i+j+k==N){
c++;
}
j++;
k--;
}
i++;
j=i+1;
k=N-(i+j);
}
System.out.println(c);
}
}