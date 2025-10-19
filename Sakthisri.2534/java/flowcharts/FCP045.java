import java.util.*;
public class FCP045{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
for(int j=1;j<=n;j++){
for(int i=1;i<=n-j;i++){
System.out.print("  ");
}
for(int i=1;i<=j*2-1;i++){
System.out.print("* ");
}
System.out.println();
}
}
}


