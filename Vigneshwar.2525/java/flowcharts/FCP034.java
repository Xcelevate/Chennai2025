import java .util.*;
public class FCP034{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
if(1<=n && n<=10000000){

for(int i = 1;i<=n;i++){

if(n%i==0){
System.out.println(i);
}
}
}
}
} 