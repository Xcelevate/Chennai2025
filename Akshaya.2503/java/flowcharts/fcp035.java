import java.util.*;
public class fcp035{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i;
int c=0;
while(i<=num){
if(i%1==0){
c=c+1;
if(i%N==0)
System.out.println("yes");
break;
}
else
{
System.out.println("no");
break;
}
}
}
}