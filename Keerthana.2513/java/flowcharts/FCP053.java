import java.util.*;
public class FCP053{
public static void main(String[]args){  
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=1;
int[] numbers=new int[n];
for(int i=0;i<n;i++)
{
numbers[i]=k;
k++;
}
for(int j=0;j<n;j++)
{
System.out.println(numbers[j]);
}
}}