// "Write a program to take a positive number from the user and then display the last digit of that number.
        
// Test Case1:
// Input:
// 843
// Output:
// 3

// Test Case2:
// Input:
// 321
// Output:
// 1

import java.util.Scanner;
// import java.txt.MessageFormate;

public class FCP_6_lastDigitOfNumber{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Number = ");
		int n = s.nextInt();
		int ld = n % 10;
		System.out.println("Last Digit Of Number = "+ ld);	
	}
}
