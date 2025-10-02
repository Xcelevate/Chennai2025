import java.util.*;
public class FCP032{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int a = ab.nextInt();
int c = 0;
for(int i = 1;i<=a;i++){
if (a%i==0){
c = c+1;
}}
if (c == 3){
System.out.print("Yes");
}
else{
System.out.print("No");
}
}
}


