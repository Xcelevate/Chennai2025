import java.util.*;
public class FCPP64{
public static void main(String[]args){
Scanner sc =new Scanner(System.in);
int n =sc.nextInt();
int m =sc.nextInt();
int arr[]=new int[n+m];
int i , k=0 ,j ;
int [] arr1=new int[n];
int [] arr2=new int[m];
for( i=0 ; i<n ; i++)
{
	arr1[i]=sc.nextInt();
}
for(j=0 ; j<m ; j++)
{
	arr2[j]=sc.nextInt();
}
while(i<m && j<n)
{
	if (arr1[i] < arr2[j]){
	arr [k]=arr1[i];
	i++ ; k++;
}
else
{
	arr [k]=arr2[j];
	j++ ; k++;
}
while(i<n)
{
	arr [k++]=arr[i++];
	while(j<m){
	arr[k++]=arr[j++];}
}
	for(int s:arr){
	System.out.println(s);
}
}
}




