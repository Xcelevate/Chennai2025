import java.util.Scanner;

public class FCP020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	int a=s.nextInt();
	int b=s.nextInt();
	int c=s.nextInt();
	int d=s.nextInt();
	int max1=0,max2=0,max3=0,min1=0,min2=0,min3=0;
	if(a>b)
	{
		max1=a;
		min1=b;
	}else{
		max1=b;
		min1=a;
	}
	if(c>d){
		max2=c;
		min2=d;
	}else{
		max2=d;
		min2=c;
	}
	if(max1>max2){
		max3=max2;
		min3=min1;
	}
	else{
		max3=max1;
		min3=min2;
	}
	if(max3>min3){
		System.out.println(max3);
	}
	else{
		System.out.println(min3);
	}
}
}
	
