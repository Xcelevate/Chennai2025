import java.util.*;
public class FCP016{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
int a=sc.nextInt();                 ;
if(a%400==0){System.out.print("Yes");}
   else if(a % 4 == 0){
        if (a%100!=0){System.out.print("Yes");}
      else{System.out.print("No");}}
     else{System.out.print("No");
}}}