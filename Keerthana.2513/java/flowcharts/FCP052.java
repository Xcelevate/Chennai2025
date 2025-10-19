import java.util.*;
public class FCP052{
public static void main(String[]args){  
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=0;
int[] numbers=new int[n];
for(int i=0;i<n;i++)
{
 numbers[i]=sc.nextInt();
}
for(int j=0;j<n;j++)
{
System.out.println(numbers[j]);
}
}}