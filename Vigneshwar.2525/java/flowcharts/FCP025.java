import java .util.*;
public class FCP025{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
int c = 0;
for(int i=1;i<=n;i+=2){
c +=i;
}

System.out.println(c);
}
}
