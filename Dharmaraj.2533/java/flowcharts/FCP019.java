import java.util.Scanner;
public class FCP019{
public static void main(String[]args){
Scanner cs=new Scanner(System.in);
int a= cs.nextInt();
Electric(a);
}
static void Electric(int x)
{
int y;
if(x<=50){
System.out.println((x*0.5)*1.2);
}
else if(x<=150){
y=x-50;System.out.println((y*0.75 + 25)*1.2);
}
else if(x<=250){
y=x-150;System.out.println((y*1.2+100)*1.2);
}
else{
y=x-250;System.out.println((y*1.5+220)*1.2);
}
}
}