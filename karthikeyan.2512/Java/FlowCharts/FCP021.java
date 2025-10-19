import java.util.Scanner;
public class FCP021{
     public static void main(String[]args){
      Scanner kk=new Scanner(System.in);
     int a=kk.nextInt();
     int b=kk.nextInt();
     int c=kk.nextInt();
     int d=kk.nextInt();
int e=kk.nextInt();
int f=kk.nextInt();
int g=kk.nextInt();
int h=kk.nextInt();
int x , y ,z;

if (a>=b){x=a; y=b;}
    else{x=b; y=a;}

if(x>=c){
   if(y>=c){z=c;}
   else{z=y; y=c;}}
else{z=y; y=x; x=c;}

if(x>=d){
    if(y>=d){
        if(z>=d){x=x;}
        else{z=d;}}
    else{z=y; y=d;}}
else{z=y; y=x; x=d;}

if(x>=e){
    if(y>=e){
        if(z>=e){x=x;}
        else{z=e;}}
    else{z=y; y=e;}}
else{z=y; y=x; x=e;}

if(x>=f){
    if(y>=f){
        if(z>=f){x=x;}
        else{z=f;}}
    else{z=y; y=f;}}
else{z=y; y=x; x=f;}

if(x>=g){
    if(y>=g){
        if(z>=g){x=x;}
        else{z=g;}}
    else{z=y; y=g;}}
else{z=y; y=x; x=g;}

if(x>=h){
    if(y>=h){
        if(z>=h){x=x;}
        else{z=h;}}
    else{z=y; y=h;}}
else{z=y; y=x; x=h;}


 System.out.println(y);
}

}