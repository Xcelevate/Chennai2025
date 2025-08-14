import java.util.*;
public class FCP020{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
int n1=input.nextInt();
int n2=input.nextInt();
int n3=input.nextInt();
int n4=input.nextInt();
int max=0;
int secmax=0;
if(n1>n2){
max=n1;
secmax=n2;
}
else{
max=n2;
secmax=n1;
}
if(n3>max){
secmax=max;
max=n3;
}
else if(n3>secmax){
secmax=n3;
}

if(n4>max){
secmax=max;
max=n4;
}
else if(n4>secmax){
secmax=n4;
}
System.out.print(secmax);
}
}

                                                                                                                    
        