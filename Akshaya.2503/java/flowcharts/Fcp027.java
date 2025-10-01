import java.util.*;
public class Fcp027{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int end=sc.nextInt();
int i=1;
float sum=1;
for(i=1;i<=end;i++){
sum=sum+1.0f/i;
}
System.out.println(sum);
}
}
