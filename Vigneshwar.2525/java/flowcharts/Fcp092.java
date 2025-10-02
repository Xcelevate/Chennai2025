import java.util.Scanner;

public class Fcp092 {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
Pattern(b);

}

static void Pattern(int a) {

for(int b=1;b<=a;b++){
for(int c=1;c<=a;c++){
if(b==1 || b==a || c==a || c==1){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.println();
}

}
}
