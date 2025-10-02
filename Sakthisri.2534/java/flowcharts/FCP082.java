import java.util.*;
public class FCP082{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
for(int j=1;j<=n;j++){
for(int i=1;i<=n-(j-1);i++){
System.out.print("* ");
}
System.out.println();
}
}
}

