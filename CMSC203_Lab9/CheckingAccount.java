
public class CheckingAccount extends BankAccount {

	// static constant FEE for the cost of clearing one check
	private static final double FEE = 0.15;
	
	// Constructor for checking account
	public CheckingAccount(String name, double initialAmount) {
		
		// Call constructor for the superclass
		super(name, initialAmount);
		
		// Initialize accountNumber
		String temp = getAccountNumber() + "-10";
		setAccountNumber(temp);
			
	}
	
	public boolean withdraw (double amount)
	{
		amount += FEE;
		return super.withdraw(amount);
		
	}

}
