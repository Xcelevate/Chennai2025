import java.util.*;
public class CV 
   {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int c=0,d=0,e;
        for (int f=1;f<=b/2;f++) {
            e=sc.nextInt();
            c+=e;
        }
        for (int g=1;g<=b/2;g++) {
            e=sc.nextInt();
            d+=e;
        }
        if (c==d) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }
}
