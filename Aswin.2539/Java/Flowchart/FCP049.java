import java.util.*;
public class FCP049{
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = scan.nextInt();
int count=0;
for(int i=2;i<n;i++){
boolean d=true;
	for(int j=2;j*j<=i;j++){
if(i%j==0){
d=false;
break;
}
}
if(d){
count=count+1;}}
System.out.println(count);
}
}