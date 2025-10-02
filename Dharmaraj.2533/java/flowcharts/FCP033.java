import java.util.*;
public class FCP033{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int b = a;
int c = 0;
int d=0;
while(a!=0){
c = a%10;
a = a/10;
d = (d*10)+c;
}
if (b==d){
System.out.print("Yes");
}
else{
System.out.print("No");
}
}
}