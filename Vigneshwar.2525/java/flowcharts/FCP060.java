import java.util.*;
public class FCP060{
public static void main(String args[]){
Scanner a=new Scanner(System.in);
int b=a.nextInt();
int c[][]=new int[b][b];
for(int d=0;d<b;d++){
c[d][0]=1;
c[d][d]=1;
for(int e=1;e<d;e++){
c[d][e]=c[d-1][e-1]+c[d-1][e];
}}
for(int d=0;d<b;d++){
for(int e=0;e<=d;e++){
System.out.print(c[d][e]+" ");}
System.out.println();}}}
