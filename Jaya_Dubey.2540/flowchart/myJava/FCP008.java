// "Write a program to take two inputs from the user and swap them without using a temporary or third variable.

// Test Case1:
// Input:
// 2
// 3
// Output:
// 3
// 2

import java.util.Scanner;

public class FCP_8_swapWithoutVariable{
	public static void main(String[] args){
    
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a 1st value : ");
		int n1 = s.nextInt();
    
		System.out.print("Enter a 2nd value : ");
		int n2 = s.nextInt();
    
    // logic without using any temporary variable  
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
    
		System.out.println("After Swap first Number = "+ n1);
		System.out.println("After Swap Second Number = "+ n2);

	}
}
