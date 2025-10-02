import java.util.Scanner;

public class Fcp096 {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
int[] c = new int[b];
int d, e, f = 0, g, h;

for(int i=0;i<b;i++){
c[i] = a.nextInt();
}

for(int i=0;i<b-1;i++){
e=0;d=0;f=0;
e = c[i];
g = i+1;
while(g<b){
if(e>c[g]){
e = c[g];
f = g;
}
g++;
}
if(f!=0){
d = c[i];
c[i] = e;
c[f] = d;
}
}

System.out.println(" ");
for(int i=0;i<b;i++){
System.out.println(c[i]);
}

}
}
