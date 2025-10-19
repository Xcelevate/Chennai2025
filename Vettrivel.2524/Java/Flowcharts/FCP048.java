import java.util.*;

public class FCP048{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int M = sc.nextInt();
int N = sc.nextInt();
int sum = 0;
int s = 0;
int x = 0;
int pow = 1;
while(M<=N)
{
int l = M;
sum=0;
s=0;
while(M!=0){
s +=1;
M/=10;
}
M=l;
while(M!=0){
x = M%10;
pow = 1;
for(int z=0;z<s;z++){
pow *=x;
}
sum+=pow;
M/=10;
}
if(sum==l)
System.out.println(sum);
M=l;
M+=1;
}

}
}

