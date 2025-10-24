import java.util.*;
public class FCP0020{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int N = a.nextInt();
   int N2 = a.nextInt();
   int N3 = a.nextInt();
   int N4 = a.nextInt();
   int Max;
   int sMax;
   if(N>N2){
    Max=N;
    sMax=N2;
     }else{
        Max=N2;
        sMax=N;
         }
    if(Max<N3){
      sMax=Max;
      Max=N3;
     }else if(sMax>N3){
                sMax=sMax; 
                   }else{
                 sMax=N3;
      }
    if(Max<N4){
      sMax=Max;
      Max=N4;
    }else if(sMax>N4){
                sMax=sMax; 
                   }else{
                 sMax=N4;
       }
    System.out.println(sMax);
 }
}