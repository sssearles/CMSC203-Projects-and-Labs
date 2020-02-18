import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a new object of type Scanner that reads from the keyboard.
		Scanner keyboard = new Scanner(System.in);
		// Declare other variables used in the program.
				
		// Create a new movie object.
		Movie movieVar = new Movie();
		
		// Add a loop to the driver class that reads input for multiple movies.
		
		char response;
		do
		{
	
			// Prompt the user to enter the title of a movie.
			System.out.println("Enter the name of a movie.");
			
			// Read in the line that the user types.
			String title;
			title = keyboard.nextLine();
		
			// Set the title in the movie object.
			movieVar.setTitle(title);
		
			// Prompt the user to enter the movie's rating.
			System.out.println("Enter the rating of the movie.");
		
			// Read in the line that the user types.
			String 	movieRating;
			movieRating = keyboard.nextLine();
		
			// Set the rating in the movie object.
			movieVar.setRating(movieRating);
		
			// Prompt the user to enter the number of tickets sold at a theater.
			System.out.println("Enter the number of tickets sold for this movie.");
		
			// Read in the integer that the user types.
			int		numTickets;
			numTickets = keyboard.nextInt();
		
			// Set the number of tickets sold in the movie object.
			movieVar.setSoldTickets(numTickets);
			keyboard.nextLine();
		
			// Print out the information using the movie's toString method.
			System.out.printf("%-20s(%s): Tickets sold: %d\n", title, movieRating, numTickets); 
	
			// Ask the user if he or she would like to enter another movie.
			String input;
			System.out.println("Would you like to enter another movie? (y or n)");
			//input = keyboard.nextLine();
			input = keyboard.next();
			response = input.charAt(0);
			keyboard.nextLine();
			
		} while (response == 'Y'|| response == 'y');
	
			// Close the scanner.
			keyboard.close();
	}

}
