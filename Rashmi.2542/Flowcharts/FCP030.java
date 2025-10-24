import java.util.*;
public class FCP030{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int Num = a.nextInt();
        boolean result = false;
        for(int i=1; i<Num/2; i++){
            if(i*i==Num){
                result=true;
                break;
            }
        }
        if(result){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}