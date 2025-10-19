import java.util.*;
public class FCP045{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int i=1;
while(n>=i){
int st=(i*2)-1;
int sp=n-i;
int j=1;
while(sp>=j){
System.out.print("  ");
j++;}
j=1;
while(st>=j){
System.out.print("*"+" ");
j++;
}
System.out.println();
i++;}}}