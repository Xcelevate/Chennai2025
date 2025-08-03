import java.util.*;
public class FCP028{
public static void main(String [] args){
Scanner scan= new Scanner(System.in);
int n=scan.nextInt();
int count=0;
if(n<10){
count=1;
}
else if(n<100){
count=2;
}
else if(n<1000){
count=3;
}
else if(n<10000){
count=4;
}
else if(n<100000){
count=5;
}
else if(n<1000000){
count=6;
}
System.out.println(count);
}
}