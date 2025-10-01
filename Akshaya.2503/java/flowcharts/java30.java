import java.util.*;
public class java30{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
String word="hi";
int end=5;
int i=1;
for(i=1;i<=5;i++){
String userword=sc.nextLine();
if(userword.equals(word))
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


