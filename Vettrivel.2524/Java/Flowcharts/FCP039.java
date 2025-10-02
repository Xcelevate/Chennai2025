import java.util.*;
public class FCP039{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

int N = scanner.nextInt();
int num = scanner.nextInt();
int min = num;
int max = num;
int i=1;
while(i<N){
int c = scanner.nextInt();
if(max<c){
max=c;
}
if(min>c){
min=c;
}
i++;
}
System.out.println(max);
System.out.println(min);
}
}

