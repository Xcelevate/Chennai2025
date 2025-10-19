import java.util.*;
public class FCP030 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int i=0;
 int n=sc.nextInt();
        while(i*i<=n){
            if(i*i==n){
                System.out.println("Yes");
                break;
            }i++;
        
        }
        if (i*i>n) {
            System.out.println("No");
        }}}