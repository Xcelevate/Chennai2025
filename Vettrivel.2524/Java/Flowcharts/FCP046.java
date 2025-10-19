import java.util.*;

public class FCP046{
public static void main(String[]args){

Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int m = N;
int j=1;
int v=1;
while(N!=1){
System.out.print("* ");
for(int i=1;i+2<=j;i++){
System.out.print("  ");
}
if(v!=1){
System.out.print("*");
}
v+=1;
j+=1;
N-=1;
System.out.println();
}
for(int k=1;k<=m;k++){
System.out.print("* ");
}
}
}

