//Bubble sort
import java.util.Scanner;
public class FCP067 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();

        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);

        }
    }
}