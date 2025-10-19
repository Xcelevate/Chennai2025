import java.util.*;
public class FCP055{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int[ ] A=new int[ N ];
for(int i=0; i<N; i++){
A[ i ]=Sc.nextInt();
}
int Target=Sc.nextInt();
boolean exist=false;
for(int j=N-1; j>=0; j--){
if(A[ j ]==Target){
exist=true;
break;
}
}
if(exist){
System.out.println("Yes");
}
else{
System.out.println("No");
}
}
}


