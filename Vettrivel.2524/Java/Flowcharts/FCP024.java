import java.util.*;
public class FCP024{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int count = 0;
for(int i=0;i<N;i++){
if(i % 2 == 0){
System.out.println(i);
count = count +1;
}
}

if(count == 0)
System.out.println();


}
}

