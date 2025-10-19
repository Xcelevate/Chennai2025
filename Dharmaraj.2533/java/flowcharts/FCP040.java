import java.util.*;
public class FCP040{
public static void main(String [] args){
Scanner ab = new Scanner(System.in);
int n =ab.nextInt();
int max=0;
int min=0;
for(int i=0;i<n;i++){
int a=ab.nextInt();
if(a>min){
max=a;
min=max;
}
else{
max=min;
min=a;
}
}
System.out.println(min);
}
}

