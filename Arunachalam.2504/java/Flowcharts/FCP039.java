import java.util.*;
public class FCP039{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int num=s.nextInt();
int max=num;
int min=num;
for(int i=1;i<n;i++){
num=s.nextInt();
if(num>max){
max=num;}
if(num<min){
min=num;}
}
System.out.println(max);
System.out.println(min);
}
}
