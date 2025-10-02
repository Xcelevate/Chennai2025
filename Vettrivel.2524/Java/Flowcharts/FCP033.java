import java.util.*;

public class FCP033{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int count = 0;
int N = sc.nextInt();
int m = N;
int sum =0;
while(N!=0){
int x  = N%10;
sum = (sum*10)+x;
N/=10;
}
if(sum==m){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}