import java.util.*;
public class FCP019{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int u=s.nextInt();
Double c,a,t;
if(u<=50){
c=u*0.5;
a=c*0.2;
t=c+a;}
else if(u<=150){
c=(50*0.5)+((u-50)*0.75);
a=c*0.2;
t=c+a;}
else if(u<=250){
c=(50*0.5)+(100*0.75)+((u-150)*1.2);
a=c*0.2;
t=c+a;}
else{
c=(50*0.5)+(100*0.75)+(100*1.2)+((u-250)*1.5);
a=c*0.2;
t=c+a;}
System.out.println(t);}}