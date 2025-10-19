import java.util.*;
public class java32{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
char letter='a';
int end=5;
int i=1;
for(i=1;i<=5;i++){
char userletter=sc.next().charAt(0);
if(userletter==letter)
{
System.out.println("you win!!");
break;
}
else{
System.out.println("Try one more time!");
}
}
}
}
