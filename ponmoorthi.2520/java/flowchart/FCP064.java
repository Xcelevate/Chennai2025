import java.util.*;
public class FCP064{
public static void main(String[]args)
{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[]A=new int[n];
	int[]B=new int[m];
	int[]C=new int[n+m];	
	for(int i=0;i<n;i++)
	{
	  A[i]=sc.nextInt();
	}
	for(int j=0;j<m;j++)
 	{
	   B[j]=sc.nextInt();
	}
	int i=0;
	int j=0;
	int s=0;
	while(i<n && j<m){
	if(A[i]<=B[j]){
	C[s]=A[i];
	i++;
	}
	else{
	C[s]=B[j];
	j++;
	}
	s++;
	}
	while(i<n){
	C[s]=A[i];
	i++;
	s++;
	}
	while(j<m){
	C[s]=B[j];
	j++;
	s++;
     }
    for(int p=0;p<n+m;p++)
    {
    System.out.println(C[p]);
    }
  }
}
