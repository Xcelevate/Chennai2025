import java.util.*;
public class Fcp033{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int s=num;
int a;
int b=0;
while(num>0){
 a=num%10;
 b=b*10+a;
 num=num/10;
}
if(s==b){
System.out.println("yes");
}
else{
System.out.println("no");
}
}
}