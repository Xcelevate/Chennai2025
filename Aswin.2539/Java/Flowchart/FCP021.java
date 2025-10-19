import java.util.*;
public class FCP021{
public static void main(String [] args){
Scanner scan= new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
int e=scan.nextInt();
int f=scan.nextInt();
int g=scan.nextInt();
int h=scan.nextInt();
int m1=0;
int m2=0;
if(a>b){
m1=a;
m2=b;}
else{
m1=b;
m2=a;}
if(c>m1){
m2=m1;
m1=c;}
else if(c>m2){
m2=c;}
if(d>m1){
m2=m1;
m1=d;}
else if(d>m2){
m2=d;}
if(e>m1){
m2=m1;
m1=e;}
else if(e>m2) {
m2=e;}
if(f>m1){
m2=m1;
m1=f;}
else if(f>m2) {
m2=f;}
if(g>m1){
m2=m1;
m1=g;}
else if(g>m2) {
m2=g;}
if(h>m1){
m2=m1;
m1=h;}
else if(h>m2) {
m2=h;}
System.out.println(m2);
} }