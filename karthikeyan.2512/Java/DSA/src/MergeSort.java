public class MergeSort {

    public static void main(String[] args) {

    }
    public void mergeSort(int[] array){
       int i =0 ;
       int j = array.length / 2;
       int[] left = new int[j];
       int[]right = new int[array.length - j ];
       for(int k =0;k<j;k++){
           left[k] = array[i];
       }
       for(int k =0;k < array.length - j;k++){
           right[k] = array[k];
       }

    }
}
