import java.util.*;
public class FCP088{
public static void main(String []args){
Scanner Sc=new Scanner(System.in);
int N=Sc.nextInt();
int temp=N;
for(int j=1; j<=N; j++){
	for(int s=1; s<=N-j; s++){
	System.out.print("  ");
	}
	int i;
	for( i= 1; i+j>=N+1; i++){
	System.out.print(temp+" ");
	for(int a=i; a<=N; a++){
	if(i+j>=N+2){
	temp--;
	System.out.print(temp+" ");
	}
	}
	}
System.out.println();
}
}
}

	