import java.util.*;

public class CV {
public static void main(String[] args) {

Scanner a = new Scanner(System.in);
int b = a.nextInt();
int c = 0, d = 0, e;

for(int i=1;i<=b/2;i++){
e = a.nextInt();
c += e;
}

for(int i=1;i<=b/2;i++){
e = a.nextInt();
d += e;
}

if(c==d){
System.out.println("Balanced");
}
else{
System.out.println("Unbalanced");
}

}
}
