
class BankAccount{
	int accountNumber;
	String accHolderName;
	double currentBalance;
	static double interestRate;

	static 
	{	
		interestRate=7.5;
	}

	BankAccount() {
        	this.accountNumber = 0;
        	this.accHolderName = "Not Assigned";
        	this.currentBalance = 0.0;
        	
    	}

    	// Parameterized constructor
    	BankAccount(int accountNumber, String accHolderName, double currentBalance) {
        	this.accountNumber = accountNumber;
        	this.accHolderName = accHolderName;
        	this.currentBalance = currentBalance;
	
        
    	}

 	// Getter
    	int getAccountNumber() {
        	return this.accountNumber;
    	}

    	String getAccHolderName() {
        	return this.accHolderName;
    	}

  	double getCurrentBalance() {
        	return this.currentBalance;
    	}

    	double getInterestRate() {
        	return this.interestRate;
    	}


	//Setter
    	void setAccountNumber(int accountNumber) {
    	    this.accountNumber = accountNumber;
    	}

    	void setAccHolderName(String accHolderName) {
        	this.accHolderName = accHolderName;
    	}

    	void setCurrentBalance(double currentBalance) {
        	this.currentBalance = currentBalance;
    	}

    	static void setInterestRate(double interestRate) {
        	interestRate = interestRate;
    	}

    	void display() {
        	System.out.println("Account Number: " + accountNumber);
        	System.out.println("Account Holder Name: " + accHolderName);
        	System.out.println("Current Balance: " + currentBalance);
        	System.out.println("Interest Rate: " + interestRate + "%");
    	}
}
class TestBankAcc{
	public static void main(String[] args)
	{
		
       	 	BankAccount b1 = new BankAccount(101,"Yashodeep",5000);
		b1.display();
		BankAccount b2 = new BankAccount(201,"Shashi",8000);
		b2.display();
		BankAccount b3 = new BankAccount(301,"Vivek",6000);
		b3.display();
		BankAccount.setInterestRate(7.5);
		b1.display();
		

	}
} 