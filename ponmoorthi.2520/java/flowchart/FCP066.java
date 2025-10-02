import java.util.*;
public class FCP066 {
    public static void main(String[] args) 
     {
      Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int arr[]=new int[n];
	int arr1[]=new int[m];
	int arr2[]=new int[n+m];
	for(int i=0;i<n;i++)
	{
	    arr[i]=sc.nextInt();
	}
	for(int j=0;j<m;j++)
	{
	   arr1[j]=sc.nextInt();
	}
	int i=0;
	int j=0;
	int k=0;
	while(i<n && j<m){
		if(arr[i]>arr1[j])
		{
		arr2[k]=arr1[j];
		k++;
		j++;
		}
		else{
			arr2[k]=arr[i];
			k++;
			i++;
			}
		}
		while( j<m)
		{
			arr2[k]=arr1[j];
		        k++;
			j++;
		}
		while( i<n){
			arr2[k]=arr[i];
			i++;
			k++;
		}
	int s=n+m;
	for(i=0;i<s-1;i++)
	{
	   if(arr2[i]!=arr2[i+1])
	{
	System.out.println(arr2[i]);
	}
	}
	if(arr2[s-1] ==arr2[s-2])
	{
	System.out.println(arr2[s-2]);
	}
	else{
	System.out.println(arr2[s-1]);
	}
	int num=-1;
	for(j=0;j<s-1;j++)
	{
	    if(arr2[j]==arr2[j+1])
		{ 
		if(num!=arr2[j])
                {
		System.out.println(arr2[j]);
		num=arr2[j];
		}
	     }
  	    else{
		num=-1;
		}
	}
    }
}