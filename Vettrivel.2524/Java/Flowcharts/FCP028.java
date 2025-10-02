import java.util.*;

public class FCP028{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
if(N<=9){
System.out.println(1);
}
else if(N<=99){
System.out.println(2);
}
else if(N<=999){
System.out.println(3);
}
else if(N<=9999){
System.out.println(4);
}
else if(N<=99999){
System.out.println(5);
}
else if(N<=999999){
System.out.println(6);
}
else{
System.out.println(7);
}

}
}