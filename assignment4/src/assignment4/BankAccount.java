package assignment4;

public class BankAccount {
	private String name;
	private int accountNumber;
	private double balance;
	
	// constructor initialising the details of the bank account with name and account number parameters
	public BankAccount(String name, int accountNumber) {
		
		// initialise the variables needed for a bank account
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = 0;
		
		// give message regarding new bank account creation
		System.out.println("New account created");
	}
	
	// returns the name of the account holder
	public String getName() {
		
		return this.name;
	}
	
	// returns the account number of the account holder
	public int getAccountNumber() {
		
		return this.accountNumber;
	}
	
	
	// gets the balance of the account
	public double getBalance() {
		
		return this.balance;
	}
	
	// updates the balance of an account to reflect the latest amount
	protected void setBalance(double balance) {
		
		this.balance = balance;
	}
	
	// deposits a specified amount into the account
	public void deposit(double amount) {
		
		// increase the balance
		this.balance += amount;
	}
	
	// withdraws a sum of money from the account
	public void withdraw(double amount) {
		
		// if the withdrawal would put the account into overdraft
		if (this.balance - amount < 0) {
			
			// give error message
			System.out.println("Cannot withdraw due to lack of funds");
			return;
		}
		
		// decrease the balance
		this.balance -= amount;
	}
	
	
	// implementation of the toString method that gives a summary of the account
	@Override
	public String toString() {
		
		return this.getName() + ": Balance = €" + this.getBalance();
	}
	

	// the main method
	public static void main(String[] args) {
		
	}
}