package assignment4;

public class BankAccountTest {

	// main method
	public static void main(String args[]) {
		
		// Create two bank accounts from the BankAccount class
		BankAccount bankAccount1 = new BankAccount("John Smith", 10000);
		BankAccount bankAccount2 = new BankAccount("Jane Jones", 10001);
		
		// print the initial balance of both accounts to the console
		System.out.println(bankAccount1.toString());
		System.out.println(bankAccount2.toString());
		
		// Deposit amounts in both bank accounts
		bankAccount1.deposit(100);
		bankAccount2.deposit(20.58);
		
		// print the balances of both accounts to the console
		System.out.println(bankAccount1.toString());
		System.out.println(bankAccount2.toString());
		
		// withdraw an amount from the first bank account
		bankAccount1.withdraw(23.92);
		
		// print the balances of both accounts to the console
		System.out.println(bankAccount1.toString());
		System.out.println(bankAccount2.toString());


	}

}
