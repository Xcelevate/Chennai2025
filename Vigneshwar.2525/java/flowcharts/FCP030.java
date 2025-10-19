import java .util.*;
public class FCP030{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int a=0;
boolean b = false;


for(int i =a;i*i<=n;i++){

if(i*i==n){
System.out.println("yes");
b = true;
break;
}
}
if(b == false){
System.out.println("no");
}
}
}

 
