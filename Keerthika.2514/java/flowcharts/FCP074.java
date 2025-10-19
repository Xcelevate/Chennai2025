import java.util.*;
public class FCP074{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int m=sc.nextInt();
int[][]a=new int[m][m];
int[][]b=new int[m][m];
for(int i=0;i<m;i++){
	for(int j=0;j<m;j++){
	 	a[i][j]=sc.nextInt();
	}
}
for(int i=0;i<m;i++){
	for(int j=0;j<m;j++){
	 	b[i][j]=sc.nextInt();
	}
}
for(int i=0;i<m;i++){
	for(int j=0;j<m;j++){
		System.out.println(a[i][j]-b[i][j]);
	}
}
}}