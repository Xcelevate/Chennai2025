import java.util.*;
public class FCP034{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int i=1;
while(i<=n){
if (n%i==0){
   System.out.println(i);
}
i++;
}
}
}
