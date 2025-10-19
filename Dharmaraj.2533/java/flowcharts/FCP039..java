import java .util.*;
public class FCP039{
public static void main(String[]args){

Scanner ab= new Scanner(System.in);
int n = ab.nextInt();
int a = ab.nextInt();
int max = a;
int max1 = a;

for(int i = 2;i<=n;i++){
int b = ab.nextInt();
if(b>max){
max=b;
}
if(max1>b){
max1=b;
}
}
System.out.println(max);
System.out.println(max1);
}
}



