import java.util.*;
public class FCP042{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
long n=input.nextInt();
long a=0;
long b=1;
long s=0;
if(n>=1){
System.out.println(a);
}
if(n>=2){
System.out.println(b);
}
for(long i=3;i<=n;i++){
s=a+b;
a=b;
b=s;
System.out.println(s);
}
}
}

