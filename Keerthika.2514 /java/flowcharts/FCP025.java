import java.util.*;
public class FCP025{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=0;
int i=0;
for(i=0;i<=n;i++){
 if(i%2==1){
	c=c+i;
	i++;
}
}
System.out.println(c);

}}
