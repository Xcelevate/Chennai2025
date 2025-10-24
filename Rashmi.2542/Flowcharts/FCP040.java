import java.util.*;
public class FCP040{
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int Num = a.nextInt(); 
        int[] arr = new int[Num]; 
        System.out.println("Enter " + Num + " elements:");
        for (int i = 0; i < Num; i++) {
            arr[i] = a.nextInt();
        }
        for(int j=0; j<arr.length; j++){
            for(int k=j+1; k<arr.length; k++){
                if(arr[j]>arr[k]){
                    int temp = arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        System.out.println("SMax:-"+arr[arr.length-2]);
    }
}