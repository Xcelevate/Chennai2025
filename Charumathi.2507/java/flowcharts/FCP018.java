import java.util.*;
public class FCP018{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int s=Sc.nextInt();
int h=0;
int d=0;
int g=0;
if(s<=10000){
h=s*20/100;
d=s*80/100;
g=s+h+d;
System.out.println(g);
}
else if(s<=20000){
h=s*25/100;
d=s*90/100;
g=s+h+d;
System.out.println(g);
}
else{
h=s*30/100;
d=s*95/100;
g=s+h+d;
System.out.println(g);
}
}
}

