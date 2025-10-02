import java.util.*;
public class FCP080{
public static void main(String[] args){
         Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            int m=input.nextInt();
            int i=0;
            int c=0;
            long[] a=new long[n];
            long[] b=new long[m];

            for(i=0;i<n;i++){
                a[i]=input.nextInt();
            }
            for(i=0;i<m;i++){
                b[i]=input.nextInt();
            }
            long A=0;
            for(i=0;i<n;i++){
                A=A*10+a[i];
            }

            long B=0;
            for(i=0;i<m;i++){
                B=B*10+b[i];
            }
            long p=A*B;

            if(p==0){
                c=1;
            } else {
                long temp = p;
                while(temp!=0){
                    temp/=10;
                    c=c+1;
                }
            }

        int[] C=new int[c];

        for(i=c-1;i>=0;i--){
                int d = (int)(p % 10);                
                p/=10;
                C[i]=d;
            }
            for(i = 0 ; i < c ; i++){
                System.out.println(C[i]);
            }
        }
    }
