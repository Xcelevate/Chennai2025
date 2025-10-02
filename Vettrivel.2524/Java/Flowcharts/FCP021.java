import java.util.*;

public class FCP021{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int D = sc.nextInt();
int E = sc.nextInt();
int F = sc.nextInt();
int G = sc.nextInt();
int H = sc.nextInt();

int max = 0;
int max1 = 0;

if(A>B){
max = A;
max1= B;
}
else{
max=B;
max1=A;
}
if(max<C){
max1=max;
max=C;
}
else if(max1<C){
max1=C;
}
else{}
if(max<D){
max1=max;
max=D;
}
else if(max1<D){
max1=D;
}
else{}
if(max<E){
max1=max;
max=E;
}
else if(max1<E){
max1=E;
}
else{}
if(max<F){
max1=max;
max=F;
}
else if(max1<F){
max1=F;
}
else{}
if(max<G){
max1=max;
max=G;
}
else if(max1<G){
max1=G;
}
else{}
if(max<H){
max1=max;
max=H;
}
else if(max1<H){
max1=H;
}
else{}

System.out.println(max1);

}
}