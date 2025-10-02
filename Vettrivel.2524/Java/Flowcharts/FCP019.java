import java.util.*;

public class FCP019{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
double sum = 0;

if(N<50){
sum = sum + (N*.5);
N = 0;
}
else{
sum = sum + 25;
N = N-50;
}
if(N<100){
sum = sum + (N*.75);
N = 0;
}
else{
sum = sum + 75;
N = N-100;
}
if(N<100){
sum = sum +(N*1.2);
N = 0;
}
else{
sum = sum + 120;
N = N-100;
}
sum = sum + (N*1.5);

sum = sum*1.2;

System.out.println(sum);
}
}