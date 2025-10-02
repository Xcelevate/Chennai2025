import java.util.*;
public class FCP040{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int num = scanner.nextInt();
int min = 0;
int max = num;
int i=1;
while(i<N){
int c = scanner.nextInt();
if(max<c){
min=max;
max=c;
}
else if(min<c){
min=c;
}
else{}
i++;
}
System.out.println(min);
}
}

