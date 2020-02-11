// This program reads a temperature (in Fahrenheit) and
// a wind speed (in miles per hour) and calculates the 
// wind chill temperature (in degrees Fahrenheit).
// Import the Scanner class.

import java.util.Scanner;

/** 
This class creates a program that calculates wind chill.
*/

public class WindChill {

	/**
	Create the main method.
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a Scanner object.
		Scanner userInput = new Scanner(System.in);

		// Define and initiate identifiers
		int 	windSpeed; 
		int		tempInF;
		double	windChill;
		final 	double 	EXP = 0.16;
		final 	String	PROGRAMMER = "Susan Searles";
			
		// Display the header for wind chill application.
		System.out.println("Wind Chill Calculator\n");
			
		// Prompt user to enter the temperature in F [-45, 40].
		System.out.println("Please enter the temperature in Fahrenheit.");
		System.out.println("It must be between -45 and 40 degrees, inclusive: ");
			
		// Read temperature input.
		tempInF = userInput.nextInt(); 
			
		// Prompt user to enter the wind speed in mph [5, 60].
		System.out.println("Please enter the wind speed in mph.");
		System.out.println("It must be between 5 and 60 mph, inclusive: ");
			
		// Read wind speed input.
		windSpeed = userInput.nextInt();
			
		// Calculate the wind chill temperature index.
		windChill = 35.74 + (0.6215*tempInF) - (35.75*Math.pow(windSpeed ,EXP)) +
					(0.4275*tempInF*Math.pow(windSpeed,EXP));
					
		// Display the wind chill temperature index.
		System.out.println("Wind Chill Temperature: " + windChill + " degrees Fahrenheit");
			
		// Display programmer name.
		System.out.println("\nProgrammer: " + PROGRAMMER);
		
		userInput.close();
	}
}
