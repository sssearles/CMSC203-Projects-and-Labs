// Lab 2 Task #4 Program to calculate Sphere Volume

import java.util.Scanner;

public class SphereVolume
{
	public static void main(String[] args)
	{
		// Declaration of identifiers.
		// Variables for the volume computation.
		double volume, diam, radius;
		
		// Create a Scanner object to read input. 
		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter the diameter of the sphere.
		System.out.print("Please enter the diameter.");
		
		// Read the diameter.
		diam = keyboard.nextDouble();
		
		// Calculate the radius of the sphere.
		radius = diam/2;
		
		// Calculate the volume of the sphere.
		volume = (4.0/3)*Math.PI*Math.pow(radius,3);
		
		// Print the volume.
		System.out.println("The volume of a sphere with diameter " + diam +
							" is " + volume + ".");
	
	}
}