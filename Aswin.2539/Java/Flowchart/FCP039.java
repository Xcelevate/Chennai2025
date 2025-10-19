import java.util.*;
public class FCP039{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
long first=scan.nextLong();
long max=first;
long min=first;
for(int i=1;i<n;i++){
long second=scan.nextLong();
if(second>max){
max=second;

}
if(second<min){

min=second;}
}
System.out.println(max);
System.out.println(min);
}
}