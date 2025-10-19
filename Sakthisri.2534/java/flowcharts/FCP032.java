import java.util.*;
public class FCP032{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int c=0;
int i=1;
while(i<=n){
if(n%i==0){
c=c+1;
}
i++;
}
if(c==3){
System.out.println("YES");
}
else{
System.out.println("NO");
}
}
}

