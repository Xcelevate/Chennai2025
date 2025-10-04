import java.util.*;
public class FCP062{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
int arr[]=new int[n];
int temp=0;
for(int i=0 ; i<n ; i++)
{
	arr[i]=sc.nextInt();
}
int k=sc.nextInt();
for( int i=1 ; i<=k ; i++)
{
	temp = arr[n-1];
	for( int s=n-1; s>0 ;s--)
	{
		arr[s]=arr[s-1];
	}
	arr[0]=temp;
}

for(int i=0;i<n;i++)
{
	System.out.println(arr[i]);
}
}
}





