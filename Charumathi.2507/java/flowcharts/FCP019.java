import java.util.*;
public class FCP019{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int u=Sc.nextInt();
double b;
double cH;
if(u<=50){
b=u*0.50;
cH=b*20/100;
System.out.println(b+cH);
}
else if(u<=150){
u=u-50;
b=u*0.75;
b=b+25;
cH=b*20/100;
System.out.println(b+cH);
}
else if(u<=250){
u=u-150;
b=u*1.20;
b=b+100;
cH=b*20/100;
System.out.println(b+cH);
}
else{
u=u-250;
b=u*1.50;
b=b+220;
cH=b*20/100;
System.out.println(b+cH);
}
}
}

