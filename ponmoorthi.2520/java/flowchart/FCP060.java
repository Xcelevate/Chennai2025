import java.util.*;
public class FCP060 {
    public static void main(String x[]) {
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int r[][]=new int[q][q];
        for (int s=0;s<q;s++) {
            r[s][0]=1;
            r[s][s]=1;
            for (int t=1;t<s;t++) 
	     {
                r[s][t]=r[s-1][t-1]+r[s-1][t];
            }
        }
        for (int s=0;s<q;s++) 
	{
            for (int t=0;t<=s;t++) 
	    {
                System.out.print(r[s][t]+" ");
            }
            System.out.println();
        }
    }
}
