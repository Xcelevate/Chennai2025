import java.util.*;
public class FCP022
{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();
int e=s.nextInt();
int ac=1;
int bc=1;
int cc=1;
int dc=1;
int ec=1;
if(a==b)
{
ac=ac+1;
}
if(a==c)
{
ac=ac+1;
}
if(a==d)
{
ac=ac+1;
}
if(a==e)
{
ac=ac+1;
}
System.out.println(a+"="+ac);
if(b!=a){
if(b==c)
{
bc=bc+1;
}
if(b==d)
{
bc=bc+1;
}
if(b==e)
{
bc=bc+1;
}
System.out.println(b+"="+bc);}
if(c!=a){
if(c!=b){
if(c==d)
{
cc=cc+1;
}
if(c==e)
{
cc=cc+1;
}
System.out.println(c+"="+cc);}}
if(d!=a){
if(d!=b){
if(d!=c){
if(d==e)
{
dc=dc+1;
}
System.out.println(d+"="+dc);}}}
if(e!=a){
if(e!=b){
if(e!=c){
if(e!=d){
{
System.out.println(e+"="+ec);}}}}}
}}

