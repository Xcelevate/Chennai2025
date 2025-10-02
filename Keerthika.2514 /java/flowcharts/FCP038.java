/*import java.util.*;
public class FCP038{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=0;
int a=0;
int b=0;
int c=0;
int p=0;
while(n>0){
for(m=n;n==0;
	a=n%10;
	b=a*a*a;
	p=p+b;
	n=n/10;
}
if(p==m){
	System.out.println("Yes");
}else{
	System.out.println("Yes");
}
}}	
*/

import java.util.*;
public class FCP038{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int m=n;
int a=0;
int b=0;
int p=0;
for(int c=1;n>0;c++){
	a=n%10;
	b=a*a*a;
	p=p+b;
	n=n/10;
}
if(p==m){
	System.out.println("Yes");
}else{
	System.out.println("No");
}
}}	




















































