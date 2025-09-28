import java.util.*;
public class FCP030{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
long N=Sc.nextLong();
long k=0;
for(long i=1; i*i<=N;i++){
k=i*i;
}
if(k==N){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}


