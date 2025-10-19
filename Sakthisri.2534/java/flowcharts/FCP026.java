import java.util.*;
public class FCP026
{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int M=input.nextInt();
int N=input.nextInt();
long S=0;
for(int i=M;i<=N;i++){
S=S+i;
}
System.out.println(S);
}
}
