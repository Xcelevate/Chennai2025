import java.util.*;
public class FCP049{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
long n=input.nextLong();
long d=0;
for(long i=2;i<n;i++){
long c=0;
for(long j=2;j*j<=i;j++){
if(i%j==0){
c=1;
break;
}
}
if(c==0){
d=d+1;
}
}
System.out.println(d);
}
}

/*AN*/

