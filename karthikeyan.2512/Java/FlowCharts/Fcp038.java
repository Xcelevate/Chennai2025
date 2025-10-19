import java.util.*;
public class Fcp038{

public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Amstrong(a);
}
static void Amstrong(int x){
int z=x;
int rev, r, c=0;
x=z;
int sum=0,ab=0;
for(int i=x; x>0;){
  r=x%10;
  ab = r*r*r;
  sum = sum + ab;     
  x/= 10;
}
if(sum==z){
     System.out.println("yes");}
else{
    System.out.println("no");}
 
}

}


