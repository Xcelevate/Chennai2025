import java.util.*;

public class FCP081{
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
m+=1;
System.out.println();
n-=1;
}

}
}

