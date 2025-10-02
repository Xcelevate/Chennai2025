import java.util.*;

public class Fcp047 {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
int[] c = new int[b];

for(int i=0;i<b;i++){
c[i] = a.nextInt();
}

int d = c[0];
int e = 0, f = 0;

for(int i=1;i<=d;i++){
int g = 0;
while(g<b){
if(c[g]%i==0){
f += 1;
g++;
}
else{
f = 0;
break;
}
}
if(f!=0){
e = i;
}
}

System.out.println(e);

}
}
