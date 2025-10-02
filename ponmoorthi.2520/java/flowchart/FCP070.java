import java.util.*;
public class FCP070 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();   
        int c[]=new int[b];  

        for (int d=0;d<b;d++) {
            c[d]=sc.nextInt();   
        }
        int e=sc.nextInt();   
        int f=0,g=b-1;  
        int h=-1;           
        while(f<=g)
	 {
            int i=(f+g)/2;
            if (c[i]==e) {
                h=i;
                break;
            } 
	    else if (c[i]<e) {
                f=i+1;
            } 
	   else {
                g=i-1;
            }
        }
        if (h!=-1)
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
