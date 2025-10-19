import java.util.*;
public class FCP035{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int count  = 0;
for(int i=1;i<=N;i++){
if(N%i==0)
count +=1;
}
if(count == 2)
System.out.println("Yes");
else
System.out.println("No");
}
}

