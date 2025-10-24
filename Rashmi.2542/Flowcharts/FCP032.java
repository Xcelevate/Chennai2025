import java.util.*;
public class FCP032{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int Num = a.nextInt();
        int count = 0;
        for(int i=1; i<=Num; i++){
            if(Num%i==0){
                count += 1;
            }
        }
        if(count==3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}