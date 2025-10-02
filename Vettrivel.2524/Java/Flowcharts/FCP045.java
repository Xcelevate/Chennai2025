import java.util.*;

public class FCP045{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int m=1;
int n = sc.nextInt();
while(n!=0){
for(int i=1;i<n;i++){
System.out.print("  ");
}
for(int v=1;v<=m;v++){
System.out.print("* ");
}
m+=2;
System.out.println();
n-=1;
}

}
}

