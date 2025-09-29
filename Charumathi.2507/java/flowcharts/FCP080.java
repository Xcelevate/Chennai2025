import java.util.*;
public class FCP080{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int M=Sc.nextInt();
int []a=new int [N];
int []b=new int [M];
int i;
for(i=0; i<N; i++){
a[i]=Sc.nextInt();
}
for(i=0; i<M; i++){
b[i]=Sc.nextInt();
}

int S=0;
for(i=N-1; i>=0; i--){
int P=0;
int carry=0;
for(int j=0; j<M; j++){
P=(b[j]*a[i]+carry)%10;
carry=(b[j]*a[i]+carry)/10;
}
S=S+P;
}
String s=Integer.toString(S);
int [ ]digit=new int [s.length()];
for(i=0; i<s.length(); i++){
digit[i]=s.charAt(i)-'0';
}
}
}