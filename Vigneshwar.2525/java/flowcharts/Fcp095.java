import java.util.Scanner;

public class Fcp095 {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
int[] c = new int[b];

for(int i=0;i<b;i++){
c[i] = a.nextInt();
}

int d, e;
for(int i=1;i<b;i++){
d = c[i];
e = i-1;
while(e>=0){
if(c[e]>c[e+1]){
d = c[e+1];
c[e+1] = c[e];
c[e] = d;
}
e--;
}
}

for(int i=0;i<b;i++){
System.out.println(c[i]);
}

}
}
