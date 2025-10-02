import java.util.*;
public class FCP083{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int s=1;
int n=input.nextInt();
for(int j=1;j<=n;j++){
for(int i=1;i<=j;i++){
System.out.print(s+" ");
s+=1;
}
System.out.println();
}
}
}

