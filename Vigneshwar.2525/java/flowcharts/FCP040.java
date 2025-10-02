import java .util.*;
public class FCP040{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a = in.nextInt();
int b = in.nextInt();
int max = 0;
int smax = 0;

if(a>b){
max=a;
smax=b;
}
else{
max=b;
smax=a;
}

for(int i = 3;i<=n;i++){
int c = in.nextInt();
if(max>c){
if(smax>c){
}
else{
smax=c;
}
}
else{
smax=max;
max=c;
}
}
System.out.println(smax);
}
}

