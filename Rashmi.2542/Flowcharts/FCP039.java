import java.util.*;
public class FCP039{
 public static void main(String[] args){
   Scanner a = new Scanner(System.in);
   int Num = a.nextInt();
   int[] arr = new int[Num]; 
   System.out.println("Enter " + Num + " elements:");
    for (int i = 0; i < Num; i++) {
        arr[i] = a.nextInt();  
    }
    int max =arr[0];
    int min = arr[0];
    for(int j=1; j<arr.length; j++){
        if(max<arr[j]){
          max = arr[j];
        }
        if(min>arr[j]){
          min = arr[j];
        }
    }
    System.out.println("Max:-"+max);
    System.out.println("Min:-"+min);
 }
}