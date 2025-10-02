import java.util.*;
public class FCP066 {
    public static void main(String[] args) 
     {
      Scanner a=new Scanner(System.in);
	int b=a.nextInt();
	int c=a.nextInt();
	int d[]=new int[b];
	int e[]=new int[c];
	int f[]=new int[b+c];
	for(int g=0;g<b;g++)
	{
	    d[g]=a.nextInt();
	}
	for(int h=0;h<c;h++)
	{
	   e[h]=a.nextInt();
	}
	int i=0;
	int j=0;
	int k=0;
	while(i<b && j<c){
		if(d[i]>e[j])
		{
		f[k]=e[j];
		k++;
		j++;
		}
		else{
			f[k]=d[i];
			k++;
			i++;
			}
		}
		while( j<c)
		{
			f[k]=e[j];
		        k++;
			j++;
		}
		while( i<b){
			f[k]=d[i];
			i++;
			k++;
		}
	int l=b+c;
	for(i=0;i<l-1;i++)
	{
	   if(f[i]!=f[i+1])
	{
	System.out.println(f[i]);
	}
	}
	if(f[l-1] ==f[l-2])
	{
	System.out.println(f[l-2]);
	}
	else{
	System.out.println(f[l-1]);
	}
	int m=-1;
	for(j=0;j<l-1;j++)
	{
	    if(f[j]==f[j+1])
		{ 
		if(m!=f[j])
                {
		System.out.println(f[j]);
		m=f[j];
		}
	     }
  	    else{
		m=-1;
		}
	}
    }
}
