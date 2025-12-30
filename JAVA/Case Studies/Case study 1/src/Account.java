abstract class Account {
	
	int accountNumber;
	String ownerName;
	double balance;
	

    Transaction[] transactions ;// array of transactions
    int index;
	
	//Constructer
	Account(int accountNumber, String ownerName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
		
		this.transactions = new Transaction[100]; // initialize array
        this.index = 0;
	}

	//deposit Function
	void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Deposited Amount : "+ amount);
		addTransaction(new Transaction(amount, "DEPOSIT"));

		
	}
	
	//withdraw Function
	void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient balance :");
		}
		else {
			balance = balance - amount;
			System.out.println("withdraw amount : "+ amount);
			addTransaction(new Transaction(amount, "WITHDRAW"));
		}
		
	}
	
	
	//Function for add Transaction
	void addTransaction(Transaction T) {
		if(index < transactions.length) {
			transactions[index] = T;
			index++;
		}  
    }
	
	//Full statement
	void getAccountStatement() {
		System.out.println("*=*=*=*=* Account Statement *=*=*=*=*=");
		for(int i = 0 ; i<index;i++) {
			transactions[i].showTransaction();
		}
	}
	
	//Last 5 Statement
	void getMinimumStatement() {
		System.out.println("*=*=*=*=*= Account Mini Statement *=*=*=*=*=");
		int start = Math.max(0,index -5);
		for(int i = start; i< index; i++) {
			transactions[i].showTransaction();
		}
		
	}
	
	//Show balance
	double getBalance() {
		return balance;
	}
	
	
	//Abstract Method
	abstract double calculateInterestRate();
	
}// Class Account end here


class SavingsAccount extends Account{
	
	final double  minimumBalance=10000;
	double  interestRate;
	
	
	SavingsAccount(int accountNumber, String ownerName, double balance,double interestRate) {
		super(accountNumber, ownerName, balance);
		this.interestRate = interestRate;
	}
	
	@Override
	double calculateInterestRate() {
		return interestRate;
	}
	
	@Override
	void withdraw(double amount) {
	    if(balance - amount < minimumBalance) {
	        System.out.println("Cannot withdraw! Minimum Rs.10000 required.");
	    } else {
	        balance -= amount;
	        System.out.println("Withdrawn: " + amount);
	        addTransaction(new Transaction(amount, "WITHDRAW"));
	    }
	}

	
	@Override
	void deposit(double amount) {

		balance = balance+amount;
		System.out.println("Deposited: " + amount);
	}
	

}  // Class SavingsAccount End here..


class SalaryAccount extends Account{
	
	String lastTransactionDate;
	boolean isFrozen;
	double freezeLimit;
	
	
	SalaryAccount(int accountNumber, String ownerName, double balance, String lastTransactionDate,
			boolean isFrozen, double freezeLimit) {
		super(accountNumber, ownerName, balance);
		this.lastTransactionDate = lastTransactionDate;
		this.isFrozen = isFrozen;
		this.freezeLimit = freezeLimit;
	}
	
	@Override
	double calculateInterestRate() {
		return 0;
	}
	
	
	boolean checkFreezeStatus() {
		if(balance < freezeLimit) {
			isFrozen = true;
		}
		else {
			isFrozen = false;
		}
		return isFrozen;
	}
	
	@Override
	void withdraw(double amount) {
		if(isFrozen) {
			System.out.println("Account is Frozen cant withdraw");
		}
		
		if(amount < balance) {
			balance = balance-amount;
			lastTransactionDate="Today";
			System.out.println("Withdrawn: " + amount);
		}
		else {
			System.out.println("Insufficient Balance");
		}
	}
	
} // Class SalaryAccount End here


class CurrentAccount extends Account{
	double overdraftLimit;

	CurrentAccount(int accountNumber, String ownerName, double balance, double overdraftLimit) {
		super(accountNumber, ownerName, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	@Override
	void withdraw(double amount) {
		if (balance - amount < -overdraftLimit) {
            System.out.println("Overdraft Limit Exceeded!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            addTransaction(new Transaction(amount, "WITHDRAW"));

        }
	}
	
	@Override
	void deposit(double amount) {
		balance = balance+amount;
		System.out.println("Deposited: " + amount);
		addTransaction(new Transaction(amount, "DEPOSIT"));

	}
	
	void payBill(double amount) {
		withdraw(amount);
	}
	
	
	@Override
	double calculateInterestRate() {
		return 0;
	}
}  // class CurrentAccount end here 

class LoanAccount extends Account{
	
	double loanAmount;
	double interestRate;
	double emiAmount;
	int totalEMIs;
	int paidEMIs;
	double ePaidAmount;
	String loanStartDate;
	String loanEndDate;
	double remainingAmount;
	
	
	LoanAccount(int accountNumber, String ownerName,
            double loanAmount, double interestRate, double emiAmount,
            int totalEMIs, String loanStartDate) {

    super(accountNumber, ownerName, -loanAmount); // Loan account does NOT have balance
    this.loanAmount = loanAmount;
    this.interestRate = interestRate;
    this.emiAmount = emiAmount;
    this.totalEMIs = totalEMIs;
    this.paidEMIs = 0;
    this.ePaidAmount = 0;
    this.loanStartDate = loanStartDate;
    this.loanEndDate = "Not Completed";
    this.remainingAmount = loanAmount;
}
	
	@Override
	void withdraw(double amount) {
		System.out.println("Withdraw Not Allowed in Loan Account!");
	}
	
	@Override
	void deposit(double amount) {
	    ePaidAmount += amount;
	    remainingAmount -= amount;
	    paidEMIs++;

	    addTransaction(new Transaction(amount, "LOAN-EMI"));

	    if(remainingAmount <= 0) {
	        remainingAmount = 0;
	        loanEndDate = "Loan Cleared";
	    }

	    System.out.println("EMI Paid: " + amount);
	}

	
	double calculateCurrentInterest() {
		return remainingAmount * interestRate / 12;
	}
	
	double calculateRemainingAmount() {
		return remainingAmount;
	}
	
	String getLoanStatus() {
		return "Remaining: " + remainingAmount + " | Paid EMIs: " + paidEMIs;
		
	}
	
} // Class LoanAccount End here
