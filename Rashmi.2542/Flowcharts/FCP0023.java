import java.util.*;
public class FCP0023{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int N = a.nextInt();
   a.nextLine();
   String Name = a.nextLine();
   a.nextLine();
   for(int i=1; i<=N; i++){
    System.out.println(Name);
   }
 }
};