import java.util.*;
public class FCP031{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int Num = a.nextInt();
        String reverse="";
        while(Num>0){
            int r = Num%10;
            reverse += r;
            Num = Math.floorDiv(Num,10);
        }
        System.out.println(reverse);
    }
}