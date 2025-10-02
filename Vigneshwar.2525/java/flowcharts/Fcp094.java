import java.util.Scanner;

public class Fcp094 {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
Pattern(b);

}

static void Pattern(int a) {

for(int b=a;b>0;b--){
for(int c=1;c<=a-b;c++){
System.out.print(" ");
}
System.out.print("* ");
for(int d=1;d<b;d++){
if(b==a || d==b-1){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.println("");
}

for(int b=2;b<=a;b++){
for(int c=a-b;c>0;c--){
System.out.print(" ");
}
System.out.print("* ");
for(int d=1;d<b;d++){
if(b==a || d==b-1){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.println("");
}

}
}
