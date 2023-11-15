package assignment4;

// extending the functionality of a bank account
public class LoanAccount extends BankAccount {
	
	// interest rate declared as a constant of 10%
	private static final double INTEREST_RATE = 0.10;
	private double overdraftLimit;
	
	// constructor for the loan account
	public LoanAccount(String name, int accountNumber) {
		
		// pass the values from the BankAccount super class to the constructor
		super(name, accountNumber);
		
		// set the overdraft to 0 for the account
		this.overdraftLimit = 0;
	}
	
	
	// overrides the withdraw method from the BankAccount super class
	@Override
	public void withdraw(double amount) {
		
		// if the withdrawal is less than the overdraft limit
		if (Math.abs(this.getBalance() - amount) < this.overdraftLimit) {
			
			return;
			
		// otherwise
		} else {
		
			// set the balance to the current balance minus the amount parameter
			this.setBalance(this.getBalance() - amount);
		
		}
	}
	
	// set a new overdraft limit for the account
	public void setOverdraftLimit(double overdraftLimit) {
		
		this.overdraftLimit = overdraftLimit;
	}
	
	// return the overdraft on the account
	public double getOverdraftLimit() {
		
		return this.overdraftLimit;
	}
	
	
	// method to calculate the interest due to being overdrawn
	public double calculateProjectedInterest() {
		
		// if the balance of the account is not in overdraft
		if (this.getBalance() >= 0) {
			
			// return 0
			return 0;
			
		// if there is overdraft on the account
		} else {
			
			// return the owed amount
			return Math.abs(this.getBalance() * INTEREST_RATE);
		
		}
	}
	

	// main method
	public static void main(String[] args) {
		
	}
}
