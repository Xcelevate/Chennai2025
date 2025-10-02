import java.util.*;

public class FCP084{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);

int n = sc.nextInt();
int a = 0;
int b=1;
for(int i=0;i<n;i++){
for(int j=0;j<1;j++){
System.out.print(a+" ");
}
b*=2;
for(int k=0;k<i;k++){
System.out.print(b+" ");
}
System.out.println();
a=b;
}

}
}

