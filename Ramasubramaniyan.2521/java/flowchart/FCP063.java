import java.util.Scanner;
public class FCP063{
public static void main(String []args){
 Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
	a[i]=s.nextInt();
}

int count=0;
int max=0;
for(int i=0;i<n;i++){
	if(a[i]==1){
		count++;
	}
	else{
		count = 0;
	}
	if(count>max){
		max=count;
	}
}
System.out.println(max);
}
} 