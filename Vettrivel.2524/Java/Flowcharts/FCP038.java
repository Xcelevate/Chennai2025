import java.util.*;

public class FCP038{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int l = N;
int sum = 0;
int s = 0;
int x = 0;
int pow = 1;
while(N!=0){
s +=1;
N/=10;
}
N=l;
while(N!=0){
x = N%10;
pow = 1;
for(int z=0;z<s;z++){
pow *=x;
}
sum+=pow;
N/=10;
}
if(sum==l)
System.out.println("Yes");
else
System.out.println("No");

}
}

