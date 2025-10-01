import java.util.*;
public class FCP029
{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int N=input.nextInt();
int S=0;
int D=0;
while(N!=0){
D=N%10;
S=S+D;
N=N/10;
}
System.out.println(S);
}
}
