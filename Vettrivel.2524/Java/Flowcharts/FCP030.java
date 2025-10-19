import java.util.*;
public class FCP030{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
int i;
int N = scanner.nextInt();
for(i=0;i*i<=N;i++){
if(i*i==N){
System.out.println("Yes");
break;
}
}
if(i*i>N){
System.out.println("No");
}

}
}

