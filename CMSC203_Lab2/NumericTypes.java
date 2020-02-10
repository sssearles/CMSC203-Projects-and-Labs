/**
   This program demonstrates how numeric types and operators behave in Java
*/
// Import the Scanner class
import java.util.Scanner;

public class NumericTypes {
	public static void main (String [] args) {
		//TASK #2 Create a Scanner object here
		
		Scanner keyboard = new Scanner(System.in);
		
		//identifier declarations
		double score1, score2;
		final int NUMBER = 2; // number of scores

//		double score1 = 100.0; // first test score
//		double score2 = 95.0; // second test score
//		final int BOILING_IN_F = 212; // boiling temperature
//		double fToC; // temperature in Celsius

		double average; // arithmetic average
		String output; // line of output to print out
	
		//Task #2 declare a variable to hold the user’s temperature
		double tempInFahrenheit, tempInCelcius;

		//Task #2 prompt user to input score1
		System.out.print("Please enter the first score: ");
		
		//Task #2 read score1 
		score1 = keyboard.nextInt();
		
		//Task #2 prompt user to input score2
		System.out.print("Please enter the second score: ");
		
		//Task #2 read score2 
		score2 = keyboard.nextInt(); 
		
		// Find an arithmetic average
		average = (score1 + score2) / NUMBER;
		output = score1 + " and " + score2 + " have an average of " + average;	
		System.out.println(output);
		
		// Convert Fahrenheit temperatures to Celsius
//		fToC = (5.0/9) * (BOILING_IN_F - 32);
//		output = BOILING_IN_F + " in Fahrenheit is " + fToC + " in Celsius.";
//		System.out.println(output);
		
		//Task #2 prompt user to input another temperature
		System.out.print("Please enter a temperature in Fahrenheit for conversion: ");
		
		//Task #2 read the user’s temperature in Fahrenheit
		tempInFahrenheit = keyboard.nextInt();
		
		//Task #2 convert the user’s temperature to Celsius
		tempInCelcius = (5.0/9) * (tempInFahrenheit - 32);
		
		//Task #2 print the user’s temperature in Celsius
		output = tempInFahrenheit + " in Fahrenheit is " + tempInCelcius + ".";
		System.out.println(output);
		
		System.out.println("Goodbye"); // to show that the program is ended	
	}
}


