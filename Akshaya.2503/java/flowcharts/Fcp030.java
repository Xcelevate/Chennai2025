import java.util.*;
public class Fcp030{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i=1;
for(i=1;i<=num/2;i++){
int square=i*i;
if(square==num){
System.out.println("yes");
break;
}
else{
System.out.println("no");
break;
}
}
}
}