import java.util.*;
public class FCP037{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

long M = scanner.nextLong();
long sum =0;
if(M<=0){
System.out.println("No");
return;
}
for(long i=1;i<M;i++){
if(M%i==0){
sum+=i;
}
}
if(sum==M){
System.out.println("Yes");
}
else{
System.out.println("No");
}

}
}

