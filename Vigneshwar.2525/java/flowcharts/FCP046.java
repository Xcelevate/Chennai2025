import java.util.*;
public class FCP046{
public static void main(String[]args){

Scanner in = new Scanner(System.in);
int n = in.nextInt();
if(n>=1){
System.out.println("*");
}

for(int r = 2;r<=n;r++){

if(r==2 || r==n){
for(int i = 1;i<=r;i++){
System.out.print("* ");
}
System.out.println();
}

if(r>2 && r<n){
for(int c=1;c<=r;c++){
if(c==1 || c==r){
System.out.print("* ");
}
else{
System.out.print("  ");
}
}
System.out.println();
}
}


}
}
