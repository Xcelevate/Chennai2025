// "Write a program to take two numbers A and B from the user and calculate the quotient and remainder when number A is divided by number B.

// Note: Print the output in the order as mentioned in the question.

// Test Case1:
// Input:
// 12
// 5
// Output:
// 2
// 2

// Test Case2:
// Input: 
// 15
// 6
// Output:
// 2
// 3

import java.util.Scanner;
import java.text.MessageFormat;

public class FCP_5_remainderQuotient{
	public static void main(String[] args){

		Scanner a = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int n1 = a.nextInt();

		System.out.print("Enter 2nd Number : ");
		int n2 = a.nextInt();

		int rem = n1/n2;
		int mod = n1%n2;
		String result = MessageFormat.format("Remainder = {0}\nQuotient = {1}",rem,mod);

		System.out.print(result);
	}
}
