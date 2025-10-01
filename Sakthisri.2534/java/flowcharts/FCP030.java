import java.util.*;
public class FCP030
{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
long i=0;
long s=0;
int N=input.nextInt();

while(i<=N){
s=i*i;
if(s==N){
System.out.println("Yes");
break;
}

i++;
}
if(s!=N) {
System.out.println("No");
}
}
}