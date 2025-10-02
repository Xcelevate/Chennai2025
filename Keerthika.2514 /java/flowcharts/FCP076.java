import java.util.*;
public class FCP076{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int a[][]=new int[M][M];
for(int i=0;i<M;i++){
	for(int j=0;j<M;j++){
		a[i][j]=sc.nextInt();
	}
}
int min=a[0][0];
for(int i=0;i<M;i++){
	for(int j=0;j<M;j++){
		if(min>a[i][j]){
			min=a[i][j];
		}
	}
}
System.out.println(min);
}}