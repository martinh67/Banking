# Banking
My fourth assignment in Java:

Develop a class called BankAccount that stores a name, account number and balance. The constructor for the class must allow the name and account number to be specified, and set the initial balance to 0. The public interface for the class must include methods to perform the following tasks:

  1.	get name, get account number, get balance
  2.	deposit (specify an amount to add to balance)
  3.	withdraw (specify an amount to subtract from balance) -- note that the maximum withdrawal is the current balance, as the balance cannot go below 0
  4.	an implementation of toString(), that will return a string with the account details, in a format like "John Smith: Balance = €1000"

None of these methods should display information on screen -- the display should all happen from the test program, described below. Ensure that all class member variables and methods are defined to be public or private as appropriate.

To test the class, write a program that does the following:

  1.	Create two BankAccount objects, with a name and account number for each
  2.	Deposit money in both accounts and withdraw some money from one
  3.	For each account, display a message with the name and balance (use toString)

Develop a new class called LoanAccount, based on BankAccount. This class has an overdraft facility, so that the user can withdraw money up to the overdraft limit. The class must store an overdraft limit for the account. It must also store the current interest rate, but this is the same for all accounts (it is not part of any one account).

The constructor will require a name and account number to be specified, and will invoke the constructor of the BankAccount class and also set the overdraft limit to 0. Also, the withdraw method from BankAccount will have to be overridden in this class, so that a negative balance is permitted. You will need to add a protected setBalance method to BankAccount, that changes the balance without checking it, since BankAccount does not normally allow negative balances.

The public interface must also include the following additional methods:

1.	set/get the overdraft limit
2.	calculate projected interest (0 if the balance is positive, otherwise multiply current balance by current interest rate)


