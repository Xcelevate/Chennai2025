import java.util.*;
public class FCP036{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
long n=input.nextInt();
long m=input.nextInt();
long max=0;
long min=0;
long r=0;
long lcm=0;
long hcf=0;
if(n>m){
max=n;
min=m;
}
else{
max=m;
min=n;
}
while(min!=0){
r=max%min;
max=min;
min=r;
}
hcf=max;
System.out.println(hcf);
long q=n*m;
lcm=q/hcf;
System.out.println(lcm);
}
}
