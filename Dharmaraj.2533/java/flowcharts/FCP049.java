import java.util.*;
public class FCP049{
public static void main(String[]args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int d = 0;
for(int i=2;i<n;i++){
 int c=0;
for(int j=2;j*j<=i;j++){
if (i%j==0){
c++;
break;
}
}
if(c==0){
d=d+1;
}
}
System.out.println(d);

}
}

