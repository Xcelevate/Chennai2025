package javaPrograms;

import java.util.Scanner;

public class FCP019 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float n = s.nextInt();
        float bill;
        if(n<=50) bill= (float) (n*0.5);
        else if (n<=150) bill = (float) (50*0.5+(n-50)*0.75);
        else if(n<=250) bill = (float) (50*0.5+100*0.75+(n-150)*1.2);
        else bill = (float) (50*0.5+100*0.75+100*1.2+(n-250)*1.5);
        System.out.println(bill+0.2*bill);
        }
    }

