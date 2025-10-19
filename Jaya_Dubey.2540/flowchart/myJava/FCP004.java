// "Write a program to take two numbers from the user and perform Six basic operations (addition, subtraction, multiplication, division, integer division and modulus) on // those two numbers.    
// Note: Print the output in the order as mentioned in the question.
// Test Case1:
// Input: 
// 12 
// 5
// Output: 
// 17
// 7
// 60	
// 2.4
// 2
// 2

import java.util.Scanner;
import java.text.MessageFormat;
	
public class FCP_4_simpleCalculator{
	public static void main(String[] args){
		Scanner a = new Scanner(System.in);

		System.out.print("Enter first number for Calculation : ");
		int num1 = a.nextInt();

		System.out.print("Enter second number for Calculation : ");
		int num2 = a.nextInt();

		int sum = num1 + num2;
		int sub = num1 - num2;
		int multy = num1 * num2;
		int div = num1 / num2;
		double intdiv = (double)num1 / num2;
		int rem = num1 % num2;

		String message = MessageFormat.format("Addition = {0}\nSubstraction = {1}\nMultiplication = {2}\nDivision = {3}\nInteger Division = {4}\nModulous = {5}", sum, sub, multy, div, intdiv, rem);
		System.out.println(message);
	}
}
