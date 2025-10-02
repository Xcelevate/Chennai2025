import java.util.*;
public class FCP018{
public static void main(String[]args){
Scanner sc=new Scanner (System.in);
int BS=sc.nextInt();
float HRA=0;
float DA=0;
float CS=0;

if(BS<=10000)
{
 HRA=BS*0.2f;
 DA=BS*0.8f;
 CS=BS+HRA+DA;
 System.out.println((int)CS);
}

else if(BS<=20000)
{
   HRA=BS*0.25f;
   DA=BS*0.9f;
   CS=BS+HRA+DA;
 System.out.println((int)CS);
}

 else{
   HRA=BS*0.3f;
   DA=BS*0.95f;
   CS=BS+HRA+DA;
 System.out.println((int)CS);
}
}}