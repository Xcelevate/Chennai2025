import java.util.*;
public class FCP082{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=1;i<=n;i++){
for(int k=n;k>=i;k--){
System.out.print("*"+" ");}
System.out.println();}}}