import java.util.*;
public class FCP027{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
float s=0;
float s1=0;
for(int i=1;i<=n;i++){
s=(float)1/i;
s1=(float)(s1+s);
}
System.out.printf("%.2f\n",s1);
}
}