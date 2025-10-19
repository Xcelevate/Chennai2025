// "Write a program to take three variables to store your birth date, birth month, and birth year, respectively, and then print them one by one in a specified order.

// Test Case1:
// Explanation:
// If the birth date is 22, the birth  is May and the birth year is 2001 then
// Input:
// 22
// May
// 2001
// Output:
// 22
// May
// 2001"

import java.util.Scanner;
public class FCP_1_birthDate{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Birth Day: ");
		int day = scanner.nextInt();	

		System.out.println("Enter your Birth Month: ");
		String month = scanner.next();	

		System.out.println("Enter your Birth Year:  ");
		int year = scanner.nextInt();

		System.out.println(day +"\n"+ month +"\n"+ year);
	}
}
