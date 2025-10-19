// Swap with Temp Variable
	
//"Write a program to take two values from the user and swap them. using the third variable

// Test Case1:
// Input:
// 12
// 4
// Output:
// 4
// 12

// Test Case2:
// Input:
// 99
// 45
// Output:
// 45
// 99"

import java.util.Scanner;
public class FCP_3_swapWithTemp{
	public static void main(String[] args){		
		Scanner a = new Scanner(System.in);
		System.out.print("Enter first Number: ");
		int num = a.nextInt();
		System.out.print("Enter second Number: ");
		int num2 = a.nextInt();
		int temp = num;
		num = num2;
		num2 = temp;
		System.out.println("After swaping:\nnum1 = "+ num+ "\nnum2 = "+ num2);

	}
}
