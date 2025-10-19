//Rotate Array with Gap K


import java.util.*;
public class Fcp069 {
    public static void main(String[] args) {
        Scanner kk=new Scanner(System.in);
                String n=kk.nextLine();
	 	String []arr=n.split(" ");
		int brr[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
		   brr[i]=Integer.parseInt(arr[i]);
		}
		 for (int num : brr) {
            System.out.println(num );
        }
}
}