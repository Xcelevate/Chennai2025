import java.util.*;
public class countofdigitswithoutloop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();         
        if(n<0){
            return;
        }
        else if(n==0){
            System.out.println(0);
            return;
        }
        else if(n<10){
            System.out.println(1);
            return;
        }else if(n<100){
            System.out.println(2);
            return;
        }else if(n<1000){
            System.out.println(3);
            return;
        }else if(n<10000){
            System.out.println(4);
            return;
        }else if(n<100000){
            System.out.println(5);
            return;
        }else if(n<1000000){
            System.out.println(6);
            return;
        }else {
            return;
        }
    }
}