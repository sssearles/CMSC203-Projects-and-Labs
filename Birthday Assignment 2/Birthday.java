import javax.swing.JOptionPane;
import java.util.Random;

// Create a Driver class called Birthday.
public class Birthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define and initialize variables
		String	childName, toyChoice, childAge;
		int		age, orderNumber;
		double	totalToy = 0.0, totalOrder = 0.0;
		String	redoResponse, cardResponse, balloonResponse, anotherToy;
		boolean	allGood = false;
		char	response, newToy = 'y';
		Toy		gift;
		Random	randomNum = new Random();
				
		// Display welcome message.
		JOptionPane.showMessageDialog(null, "Welcome to ToysWereUs "
				+ "where you can choose gifts"
				+ " for young children");
		
		// Begin while loop for asking if user would like another gift.
		while (newToy == 'Y'|| newToy =='y')
		{
			do
			{
		
			// Test toy for age appropriateness.
				// Ask for the name of the child.
				childName = JOptionPane.showInputDialog("Enter the child's name: ");
				// Ask for the age of the child.
				childAge = JOptionPane.showInputDialog("Enter the child's age: ");
				age = Integer.parseInt(childAge);
				// Ask for the toy choice.
				toyChoice = JOptionPane.showInputDialog("Choose a toy: plushie, blocks, or a book: ");
				// Validate the input choice.
				gift = new Toy(toyChoice, age);
				allGood = gift.ageOK();
				
				if (allGood == false)
				{
					// If toy is not appropriate, ask if the user wants to cancel that toy request. (end while loop)
					redoResponse = JOptionPane.showInputDialog("Your toy choice is not appropriate"
							+ "for this age child."
							+ "Would you like to choose another toy (Y or N)?");
					response = redoResponse.charAt(0);
					if (response == 'N' || response == 'n')
					{
						allGood = true;
					}
					else allGood = false;
				}
			} while (allGood == false);
				
			// Ask if a card should be added.
			cardResponse = JOptionPane.showInputDialog("Would you like to add a card (yes or no)?");
			if (cardResponse.compareTo("y") == 0 || cardResponse.compareTo("Y") == 0)
			{
				cardResponse = "yes";
			}
			gift.addCard(cardResponse);
	
			// Ask if a balloon should be added.
			balloonResponse = JOptionPane.showInputDialog("Would you like to add a balloon (yes or  no)?");
			if (balloonResponse.compareTo("y") == 0 || balloonResponse.compareTo("Y") == 0)
			{
			balloonResponse = "yes";
			}
			gift.addBalloon(balloonResponse);
			
			// Display name, age, and total for this gifts.
			totalToy = gift.getCost();
			System.out.printf("The gift for %s who is %d years old is %s $%.2f\n", childName, age,toyChoice, totalToy);
		
			// Ask user if he or she wants to select another gift.
			anotherToy = JOptionPane.showInputDialog("Would you like to choose another gift (yes or no)?");
			newToy = anotherToy.charAt(0);
		
			// Accumulate the total cost of the order thus far.
			totalOrder += totalToy;
			// If yes, return to "Ask for the name of child."
		}
		//If no, calculate order total and random order number. 
		orderNumber = randomNum.nextInt(100000);
		// Display order total, five-digit order number, and programmer name.		
		System.out.printf("The total cost of your order is $%.2f. Order number: %05d\n", totalOrder, orderNumber);

	}

}
