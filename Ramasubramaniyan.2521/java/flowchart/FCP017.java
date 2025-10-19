import java.util.Scanner;
public class FCP017{
public static void main(String[]args)
{
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int max=0;
int min=0;
if(a>b){
max=a;
min=b;
}
else{
max=b;
min=a;
}
if(min>c){
System.out.println(min);
}else{
if(max>c){
System.out.println(c);
}
else{
System.out.println(max);
}
}
}
}
