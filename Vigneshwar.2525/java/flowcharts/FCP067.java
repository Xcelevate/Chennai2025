import java.util.*;
public class FCP067{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b[]=new int[a];
for(int i=0;i<a;i++){
b[i]=s.nextInt();}
for(int i=0;i<a-1;i++){
for(int j=0;j<a-i-1;j++){
if(b[j]>b[j+1]){
int c=b[j];
b[j]=b[j+1];
b[j+1]=c;}}}
for(int i=0;i<a;i++){
System.out.println(b[i]);}}}
