import java.util.*;

public class FCP018{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int N= sc.nextInt();
double hra = 0;
double da = 0;
int gs  = 0;
if(N<=10000){
hra = N*.2;
da = N*.8;
gs = (int)(N + hra + da);
}
else if(N<=20000){
hra = N*.25;
da = N*.9;
gs = (int)(N + hra + da);
}
else{
hra = N*.3;
da = N*.95;
gs = (int)(N + hra + da);
}

System.out.println(gs);

}
}