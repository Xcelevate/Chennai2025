import java.util.Scanner;

public class CZ {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
int c = 0;

for(int d=2;d<=b;d++){
int e, f, g = 0;
if(d%2==0){
e = d;
while(e>0){
f = e%10;
if(f%2==1){
g = 1;
}
e /= 10;
}
if(g==0){
c += 1;
}
}
}

System.out.println(c);

}
}
