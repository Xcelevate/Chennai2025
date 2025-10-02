import java.util.*;

public class FCP032{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int count = 0;
int N = sc.nextInt();
for(int i=1;i<=N;i++){
if(N%i==0){
count = count + 1;
}
}
if(count==3){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}