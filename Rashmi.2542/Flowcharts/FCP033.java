import java.util.*;
public class FCP033{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int Num = a.nextInt();
        int New_number = 0;
        int count = Num;
        while(Num>0){
            int r = Num%10;
            New_number = New_number*10+r;
            Num = Math.floorDiv(Num,10);
        }
        if(New_number==count){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}