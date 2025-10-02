import java.util.*;
public class FCP017{
public static void main(String[]args){
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();

int max, smax;
if(a>b){
max = a;
smax = b;
}
else{
max = b;
smax = a;
}

if(c>max){
smax = max;
max = c;
}
else if(c>smax){
smax = c;
}

System.out.println(smax);
}
}
