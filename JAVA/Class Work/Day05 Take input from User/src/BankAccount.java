import java.util.Scanner;

class BankAccount
{
	int accountNumber;
	String accHolderName;
	double currentBalance;
	double interestRate;

	// Default Constructor
    	public BankAccount() 
	{
        accountNumber = 0;
        accHolderName = "Unknown";
        currentBalance = 0.0;
        interestRate = 0.0;
   	 }

    	// Parameterized Constructor
    	public BankAccount(int accountNumber, String accHolderName, double currentBalance, double interestRate) 
	{
        this.accountNumber = accountNumber;
        this.accHolderName = accHolderName;
        this.currentBalance = currentBalance;
        this.interestRate = interestRate;
    	}

	
	//Geter
	int getaccountNumber()
	{
	return this.accountNumber=accountNumber;
	}

	void setAccountNumber(int accountNumber) 
	{
        this.accountNumber = accountNumber;
    	}

	double getCurrentBalance() 
	{
        return currentBalance;
    	}

	double getInterestRate() 
	{
        return interestRate;
    	}

	void display() 
	{
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accHolderName);
        System.out.println("Current Balance: " + currentBalance);
        System.out.println("Interest Rate: " + interestRate + "%");
    	}



}  //class BankAccount End Here

class testBankAccount
{
	public static void main(String [] args)
	{
	Scanner sc=new Scanner(System.in);

	BankAccount acc1 = new BankAccount();
	acc1.display();

	sc.nextLine();

	System.out.println("Enter the Details :");
	

	System.out.println("Holder ID:");
	int a=sc.nextInt();

	sc.nextLine();

	System.out.println("Holder Name:");
	String str=sc.nextLine();

	System.out.println("Balance:");
	double d=sc.nextDouble();

	System.out.println("interest Rate :");
	double d1=sc.nextDouble();

	BankAccount acc2 = new BankAccount(a,str,d,d1);
	acc2.display();


	}
}

