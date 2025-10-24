import java.util.*;
public class FCP0020{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int N = a.nextInt();
   int N2 = a.nextInt();
   int N3 = a.nextInt();
   int N4 = a.nextInt();
   int N5 = a.nextInt();
   int N6 = a.nextInt();
   int N7 = a.nextInt();
   int N8 = a.nextInt();
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
    if(Max<N5){
      sMax=Max;
      Max=N5;
    }else if(sMax>N5){
                sMax=sMax; 
                   }else{
                 sMax=N5;
       }
    if(Max<N6){
      sMax=Max;
      Max=N6;
    }else if(sMax>N6){
                sMax=sMax; 
                   }else{
                 sMax=N6;
       }
    if(Max<N7){
      sMax=Max;
      Max=N7;
    }else if(sMax>N7){
                sMax=sMax; 
                   }else{
                 sMax=N7;
       }
    if(Max<N8){
      sMax=Max;
      Max=N8;
    }else if(sMax>N8){
                sMax=sMax; 
                   }else{
                 sMax=N8;
       }
    System.out.println(sMax);
 }
}