import java .util.*;
public class FCP032{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();

int a = 1;
int c = 0;

for(int i = a;i<=n;i++){
int b = n%i;
if(b==0){
c=c+1;
}
}
if(c==3){
System.out.println("yes");
}
else{
System.out.println("no");
}
}
}

