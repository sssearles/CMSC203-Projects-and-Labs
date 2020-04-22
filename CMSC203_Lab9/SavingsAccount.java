// New class Savings account that extends BankAccount
public class SavingsAccount extends BankAccount{

	// Instance variable rate that represents annual interest rate
	private double rate = 0.025;
	
	// Instance variable savingsNumber that identifies separate savings 
	// accounts
	private int savingsNumber = 0;
	
	// Instance variable accountNumber that hides accountNumber from superclass
	private String accountNumber;
	
	// Constructor that takes a name and initial balance and calls the
	// constructor from the superclass. 
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
		
		// Initialize accountNumber to current value in superclass accountNumber 
		// plus -savingsNumber
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	// Method with no params and no return. Calculates one month's interest
	// and deposits it into the account.
	public void postInterest() {
		double interest = (rate/12)*super.getBalance();
		super.setBalance(super.getBalance() + interest);
	}
	
	// Method overrides the getAccountNumber method in the superclass
	public String getAccountNumber() {
		return accountNumber;
	}

	// Copy constructor creates another savings account for same owner. Takes
	// original savings account and an initial balance as parameters. 
	public SavingsAccount(SavingsAccount origSavingsAccount, double initBalance) {
		
		// Call the copy constructor of the superclass
		super(origSavingsAccount, initBalance);
		
		// Increment and assign the new savingsNumber
		this.savingsNumber = origSavingsAccount.savingsNumber +1;
		
		// Assign the account number to be the account number of the superclass
		// plus -savingsNumber of the new account
		accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
	}
	

}
