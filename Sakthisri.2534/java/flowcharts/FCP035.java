import java.util.*;
public class FCP035{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int c=0;
for(int i=1;i<=n;i++){
if(n%i==0){
c=c+1;
}
}
if(c==2){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}