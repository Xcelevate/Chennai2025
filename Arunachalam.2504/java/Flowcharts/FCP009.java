import java.util.*;
public class FCP009{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
int x=s.nextInt();
int y=s.nextInt();
int q=x/y;
int l=y*q;
if(x>l){
System.out.println(l);}
else{
System.out.println(l-y);}
}}