package assignment4;

public class LoanAccountTest {
	
	// main method to test LoanAccount functionality
	public static void main(String[] args) {
		
		// Create two loan accounts with a name and unique account number
		LoanAccount loanAccount1 = new LoanAccount("Peter Griffin", 10003);
		LoanAccount loanAccount2 = new LoanAccount("Cleveland Brown", 10004);
		
		// set the overdraft limit for both accounts
		loanAccount1.setOverdraftLimit(0);
		loanAccount2.setOverdraftLimit(10);
		
		// display the initial account details for both
		System.out.println(loanAccount1.toString());
		System.out.println(loanAccount2.toString());
		
		// deposit an amount in both accounts
		loanAccount1.deposit(100);
		loanAccount2.deposit(60);
		
		// display the updated account details for both
		System.out.println(loanAccount1.toString());
		System.out.println(loanAccount2.toString());
		
		// withdraw an amount from both accounts
		loanAccount1.withdraw(1000);
		loanAccount2.withdraw(50);
		
		// display the final account details for both
		System.out.println(loanAccount1.toString());
		System.out.println(loanAccount2.toString());
		
		// display the interest for both loan accounts using the account number as an identifier
		System.out.println("Account Number: " + loanAccount1.getAccountNumber() +
				" Projected Interest: €" + loanAccount1.calculateProjectedInterest());
		System.out.println("Account Number: " + loanAccount2.getAccountNumber() + 
				" Projected Interest: €" + loanAccount2.calculateProjectedInterest());
		
	}

}

