import java.util.*;
public class FCP042{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
 int N=sc.nextInt();
 long x=0;
 long y=1;
for(int i=1;i<=N;i++){
 System.out.println(x);
long z=x+y;
 x=y;
 y=z;}
}}