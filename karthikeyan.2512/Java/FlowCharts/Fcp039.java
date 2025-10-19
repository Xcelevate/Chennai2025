import java.util.Scanner;
public class Fcp039{
public static void main(String[]args){
Scanner kk=new Scanner(System.in);
int n=kk.nextInt();
int a=kk.nextInt();
int b=kk.nextInt();
int max,min;
if(a>=b){max=a;min=b;}
else{max=b;min=a;}

for(int i=3;i<=n; i++){
int c=kk.nextInt();
if(max<=c){max=c;}
    else if(min>=c){min=c;}
  }
System.out.println(max);
System.out.println(min);
}
}

