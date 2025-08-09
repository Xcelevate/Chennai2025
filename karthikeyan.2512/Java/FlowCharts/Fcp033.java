import java.util.Scanner;
public class Fcp033{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int a=kk.nextInt();
Palindrome(a);
}

static void Palindrome(int x){
   int z=x;
   int r,rev=0;
   for(int i=x; x>0;){
    r=x%10;
    rev =(rev*10) + r;
    x /= 10;
}
if(z==rev){System.out.println("yes");}
else{System.out.println("no");}
}
}