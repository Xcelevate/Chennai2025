import java.util.*;
public class Fcp025{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int end=sc.nextInt();
int i=1;
int j=1;
int sum=0;
for(i=1;i<=end;i++){
if(i%2!=0){
sum=sum+i;
}
else{
sum=sum;
}
}
System.out.println(sum);
}
}
