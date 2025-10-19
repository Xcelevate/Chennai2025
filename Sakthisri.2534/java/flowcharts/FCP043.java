import java.util.*;
public class FCP043{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int x=input.nextInt();
double s=0;
for(int i=1;i<=n;i++){
s+=Math.pow(x,i)/i;
}
System.out.println(Math.round(s));
}
}