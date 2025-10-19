import java.util.*;
public class FCP083{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int p=1;
for(int i=1;i<=n;i++){
for(int j=1;j<=i;j++,p++){
System.out.print(p+" ");}
System.out.println();}}}
