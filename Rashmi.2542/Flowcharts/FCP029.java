import java.util.*;
public class FCP029{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int Num = a.nextInt();
        int main=0;
        while(Num>0){
            int r = Num%10;
            main =main + r; 
            Num = Math.floorDiv(Num,10);
        }
        System.out.println(main);
    }
}