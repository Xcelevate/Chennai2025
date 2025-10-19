import java.util.*;
public class FCP024{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i=0;
for(i=0;i<n;i++){
if(i%2==0){
	System.out.println(i);
	i++;
	}else{
	i++;
	}
}
}}