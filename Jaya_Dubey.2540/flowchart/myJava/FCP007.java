// "Write a program to convert a temperature from Celsius to Fahrenheit using the formula  C/5 = (F-32)/9
// Test Case1:
// Input: 
// 30 
// Output:
// 86

import java.util.Scanner;
public class FCP_7_CelsiusToFahrenheit{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a Celsius value: ");
		int C = s.nextInt();
		int F = (C * 9/5)+32;
		System.out.println("Celsius to Fahrenheit = "+F);
	}
}	
