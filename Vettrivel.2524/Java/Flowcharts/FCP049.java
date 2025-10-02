import java.util.*;
public class FCP049{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

long N = scanner.nextLong();
long count=0;
long s = 0;
long i=2;
while(i<N){
s =0;
for(long j=2;j*j<=i;j++){
if(i%j==0){
s+=1;
break;
}
}
if(s==0){
count+=1;
}
i++;
}
System.out.println(count);
}
}

