import java.util.*;
public class FCP039{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n=input.nextInt();
int num=input.nextInt();
int min=num;
int max=num;
for(int i=1;i<n;i++){
num=input.nextInt();
if(num>max){
max=num;
}
if(num<min){
min=num;
}
}
System.out.println(max);
System.out.println(min);
}
}
