import java.util.*;

public class FCP020{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int A = sc.nextInt();
int B = sc.nextInt();
int C = sc.nextInt();
int D = sc.nextInt();
int max = 0;
int max1 = 0;
int min = 0;
int min1 =0;

if(A>B){
max = A;
min = B;
}
else{
max = B;
min = A;
}
if(C>D){
max1 = C;
min1 = D;
}
else{
max1 = D;
min1 = C;
}
if(max>max1){
	if(max1>min){
		System.out.println(max1);
	}
	else{
		System.out.println(min);
	}
}
else{
	if(max>min1){
		System.out.println(max);
	}
	else{
		System.out.println(min1);
	}		
		
}


}
}