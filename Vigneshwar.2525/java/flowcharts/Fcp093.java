import java.util.*;

public class Fcp093 {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
Pattern(b);

}

static void Pattern(int a) {

for(int b=0;b<a;b++){
for(int c=1;c<a-b;c++){
System.out.print(" ");
}
System.out.print("*");
for(int d=0;d<=b*2-2;d++){
System.out.print(" ");
}
if(b>0){
System.out.print("*");
}
System.out.println("");
}

for(int b=a-1;b>0;b--){
for(int c=1;c<=a-b;c++){
System.out.print(" ");
}
System.out.print("*");
for(int d=1;d<b*2-2;d++){
System.out.print(" ");
}
if(b>1){
System.out.print("*");
}
System.out.println("");
}

}
}
